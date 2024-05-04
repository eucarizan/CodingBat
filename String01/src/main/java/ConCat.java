public class ConCat {
    public static String conCat(String a, String b) {
        if (!a.isEmpty() && !b.isEmpty() && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }
}
