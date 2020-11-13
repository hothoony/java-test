package study.secretkeytest;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class SecretKeyGenerator {

    public String hmacsha256() throws NoSuchAlgorithmException {
        return generate("HMACSHA256", Base64.getEncoder());
    }

    public String aes() throws NoSuchAlgorithmException {
        return generate("AES", Base64.getEncoder());
    }

    public String generate(String algorithm, Base64.Encoder encoder) throws NoSuchAlgorithmException {
        KeyGenerator keygen = KeyGenerator.getInstance(algorithm);
        keygen.init(256, new SecureRandom());
        SecretKey secretKey = keygen.generateKey();
        return encoder.encodeToString(secretKey.getEncoded());
    }
}
