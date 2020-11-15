package study.jjwttest.jjwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

class JjwtManagerTest {

    private JjwtManager jjwtManager = new JjwtManager();
    public static final String SECRET = "tz3yG8QxYxVuP1CMVwZujtjc8eLRYYuu9U1a18j0b8A=";
    public static final String SECRET2 = "yx_SUVhSS6Y74RZLAoB33mDyTu2tsZvhlI7ZV0iVT4w=";

    @Test
    void validCaseTest() {
        TokenMap tokenMap = newTokenMap();
        System.out.println("tokenMap = " + tokenMap);

        String token = jjwtManager.createToken(tokenMap, SECRET);
        System.out.println("token = " + token);

        String[] tokens = token.split("\\.");
        token = tokens[0] + "." + tokens[1] + "." + tokens[2];

        Claims claims = jjwtManager.parseToken(token, SECRET);
        System.out.println("claims = " + claims);
    }

    @Test
    void expiraitonTest() {
        long nowTime = System.currentTimeMillis();

        TokenMap tokenMap = newTokenMap();
        tokenMap.put("iat", new Date(nowTime));
        tokenMap.put("exp", new Date(nowTime - 1000));

        assertThatThrownBy(() -> {
            SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
            tokenTest(secretKey, tokenMap, secretKey);
        }).isInstanceOf(ExpiredJwtException.class);
    }

    @Test
    void secretKeyTest1() {
        TokenMap tokenMap = newTokenMap();

        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        tokenTest_sameSecretKey(secretKey, tokenMap);

        assertThrows(SignatureException.class, () -> {
            tokenTest_differentSecretKey(secretKey, tokenMap, Keys.hmacShaKeyFor(SECRET2.getBytes()));
        });
    }

    @Test
    void secretKeyTest2() {
        TokenMap tokenMap = newTokenMap();

        SecretKey secretKey = Keys.hmacShaKeyFor(SECRET.getBytes());
        tokenTest_sameSecretKey(secretKey, tokenMap);

        assertThrows(SignatureException.class, () -> {
            tokenTest_differentSecretKey(secretKey, tokenMap, Keys.hmacShaKeyFor(SECRET2.getBytes()));
        });
    }

    @Test
    void secretKeyTest3() {
        TokenMap tokenMap = newTokenMap();

        SecretKey secretKey = new SecretKeySpec(SECRET.getBytes(), SignatureAlgorithm.HS256.getJcaName());
        tokenTest_sameSecretKey(secretKey, tokenMap);

        assertThrows(SignatureException.class, () -> {
            tokenTest_differentSecretKey(secretKey, tokenMap, Keys.hmacShaKeyFor(SECRET2.getBytes()));
        });
    }

    private TokenMap newTokenMap() {
        long nowTime = System.currentTimeMillis();

        TokenMap tokenMap = new TokenMap();
        tokenMap.setIssuer("my admin");
        tokenMap.setSubject("my service");
        tokenMap.put("iat", new Date(nowTime));
        tokenMap.put("exp", new Date(nowTime + 10000));
        tokenMap.put("name", "user name");
        tokenMap.put("age", 20);
        return tokenMap;
    }

    private void tokenTest_sameSecretKey(SecretKey secretKey, TokenMap tokenMap) {
        tokenTest(secretKey, tokenMap, secretKey);
    }

    private void tokenTest_differentSecretKey(SecretKey secretKey, TokenMap tokenMap, SecretKey differentSecretKey) {
        tokenTest(secretKey, tokenMap, differentSecretKey);
    }

    private void tokenTest(SecretKey secretKey4Create, TokenMap tokenMap, SecretKey secretKey4Parse) {
        System.out.println();
        System.out.println("secretKey4Create : " + Base64.getUrlEncoder().encodeToString(secretKey4Create.getEncoded()));
        System.out.println("secretKey4Parse  : " + Base64.getUrlEncoder().encodeToString(secretKey4Parse.getEncoded()));

        String token = jjwtManager.createToken(tokenMap, secretKey4Create);
        System.out.println("token = " + token);

        Claims claims = jjwtManager.parseToken(token, secretKey4Parse);
        System.out.println("issuer  = " + claims.getIssuer());
        System.out.println("subject = " + claims.getSubject());
        System.out.println("issuedAt   = " + claims.getIssuedAt());
        System.out.println("expiration = " + claims.getExpiration());
        System.out.println("claims.get('name') = " + claims.get("name"));
        System.out.println("claims.get('age')  = " + claims.get("age"));
    }
}
