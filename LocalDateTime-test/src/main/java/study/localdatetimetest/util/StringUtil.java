package study.localdatetimetest.util;

public class StringUtil {

    public static String rpad(Object obj, int len, String padding) {
        String str = String.valueOf(obj);
        while (str.length() < len) {
            str = str + padding;
        }
        return str;
    }

    public static String rpad(Object obj, int len) {
        return rpad(obj, len, " ");
    }
}
