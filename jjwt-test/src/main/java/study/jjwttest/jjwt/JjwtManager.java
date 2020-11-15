package study.jjwttest.jjwt;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.HashMap;
import java.util.Map;

public class JjwtManager {

    public String createToken(TokenMap claims, String secret) {
        return createToken(claims, getSecretKey(secret));
    }

    public Claims parseToken(String jwtString, String secret) {
        return parseToken(jwtString, getSecretKey(secret));
    }

    private SecretKey getSecretKey(String secret) {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }

    public String createToken(TokenMap claims, SecretKey secretKey) {
        Map<String, Object> header = new HashMap<>();
        header.put("typ", "JWT");

        String jwtString = Jwts.builder()
                .setHeader(header)
                .setClaims(claims)
                .signWith(secretKey)
                .compact();

        return jwtString;
    }

    public Claims parseToken(String jwtString, SecretKey secretKey) {
        Jws<Claims> jwsClaims = Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(jwtString);

        return jwsClaims.getBody();
    }
}
