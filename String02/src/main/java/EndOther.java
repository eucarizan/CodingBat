public class EndOther {
    public static boolean endOther(String a, String b) {
        if (a.length() < b.length()) {
            return a.equalsIgnoreCase(b.substring(b.length() - a.length()));
        } else {
            return b.equalsIgnoreCase(a.substring(a.length() - b.length()));
        }
    }
}
