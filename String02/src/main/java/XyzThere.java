public class XyzThere {
    public static boolean xyzThere(String str) {
        if (str.indexOf("xyz") == 0) {
            return true;
        }

        for (int i = 1; i < str.length() - 2; i++) {
            if ("xyz".equals(str.substring(i, i + 3)) && str.charAt(i - 1) != '.') {
                return true;
            }
        }

        return false;
    }
}
