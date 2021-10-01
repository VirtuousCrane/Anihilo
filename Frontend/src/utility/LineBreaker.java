package utility;

import java.lang.StringBuilder;

public class LineBreaker {
    public static String breaker(String s) {
        // * add <BR/> in " " in the last every 30 letter or less
        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        while (i + 30 < sb.length() && (i = sb.lastIndexOf(" ", i + 30)) != -1) {
            sb.replace(i, i + 1, "<BR/>");
        }
        return sb.toString();
    }
}
