public class StringX {
    public static String stringX(String str) {
        if (str.length() < 3) {
            return str;
        }

        String start = str.substring(0, 1);
        String end = str.substring(str.length() - 1);

        return start + str.substring(1, str.length() - 1).replaceAll("x", "") + end;
    }
}
