public class ComboString {
    public static String comboString(String a, String b) {
        String s = a;
        String l = b;

        if (a.length() > b.length()) {
            l = a;
            s = b;
        }

        return s + l + s;
    }
}
