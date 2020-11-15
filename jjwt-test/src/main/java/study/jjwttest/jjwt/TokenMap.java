package study.jjwttest.jjwt;

import lombok.Data;

import java.util.Date;
import java.util.HashMap;

import static study.jjwttest.jjwt.TokenMap.StandardClaim.*;

@Data
public class TokenMap extends HashMap<String, Object> {

    static enum StandardClaim {
        ISSUER("iss"),
        SUBJECT("sub"),
        ISSUED_AT("iat"),
        EXPIRATION("exp");

        private String value;

        StandardClaim(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    public String getString(String key) {
        return String.valueOf(get(key));
    }

    public void setIssuer(String value) {
        put(ISSUER.value(), value);
    }
    public String getIssuer() {
        return getString(ISSUER.value());
    }

    public void setSubject(String value) {
        put(SUBJECT.value(), value);
    }
    public String getSubject() {
        return getString(SUBJECT.value());
    }

    public void setIssuedAt(Date value) {
        put(ISSUED_AT.value(), value);
    }
    public String getIssuedAt() {
        return getString(ISSUED_AT.value());
    }

    public void setExpiration(Date value) {
        put(EXPIRATION.value(), value);
    }
    public String getExpiration() {
        return getString(EXPIRATION.value());
    }

    public String toString() {
        String LN = "\n";
        String TAB = "    ";
        StringBuilder sb = new StringBuilder();
        sb.append(LN + TAB + "TokenMap");
        sb.append(LN + TAB + "issuer = " + getIssuer());
        sb.append(LN + TAB + "subject = " + getSubject());
        sb.append(LN + TAB + "issuedAt = " + getIssuedAt());
        sb.append(LN + TAB + "expiration = " + getExpiration());
        return sb.toString();
    }

}
