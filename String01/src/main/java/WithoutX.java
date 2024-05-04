public class WithoutX {
    public static String withoutX(String str) {
        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }
}
