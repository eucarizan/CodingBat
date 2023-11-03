public class AtFirst {
    public static String atFirst(String str) {
        if (str.isEmpty()) {
            return "@@";
        }

        if (str.length() == 1) {
            return str + "@";
        }

        return str.substring(0, 2);
    }
}
