public class LastTwo {
    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        int len = str.length();
        return str.substring(0, len - 2) + str.charAt(len - 1) + str.charAt(len - 2);
    }
}
