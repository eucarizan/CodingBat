public class LastChars {
    public static String lastChars(String a, String b) {
        String start = a.isEmpty() ? "@" : a.substring(0, 1);
        String end = b.isEmpty() ? "@" : b.substring(b.length() - 1);
        return start + end;
    }
}
