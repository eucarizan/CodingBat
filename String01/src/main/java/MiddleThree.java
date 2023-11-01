public class MiddleThree {
    public static String middleThree(String str) {
        if (str.length() < 4) {
            return str;
        }

        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }
}
