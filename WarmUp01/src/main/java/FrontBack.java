public class FrontBack {
    public static String frontBack(String str) {
        int len = str.length();

        if (len > 1) {
            return str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0);
        }

        return str;
    }
}
