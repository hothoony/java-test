package study.localdatetimetest.utils;

public class StringUtil {

    public static String rpad(Object obj, int len, String padding) {
        String str = String.valueOf(obj);
        while (str.length() < len) {
            str = str + padding;
        }
        return str;
    }

    public static String lpad(Object obj, int len, String padding) {
        String str = String.valueOf(obj);
        while (str.length() < len) {
            str = padding + str;
        }
        return str;
    }

    public static String rpad(Object obj, int len) {
        return rpad(obj, len, " ");
    }

    public static String lpad02(Object obj) {
        return lpad(obj, 2, "0");
    }
}
