package study.threadtest.utils;

public class PrintUtil {
    
    public static String print(String template, Object... args) {
        String str = template;
        for (int i = 0; i < args.length; i++) {
            str = str.replaceFirst("\\{\\}", String.valueOf(args[i]));
        }
        System.out.println(str);
        return str;
    }
}
