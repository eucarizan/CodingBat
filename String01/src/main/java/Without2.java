public class Without2 {
    public static String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (!str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str;
        }

        return str.substring(2);
    }
}
