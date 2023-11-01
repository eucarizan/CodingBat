public class HasBad {
    public static boolean hasBad(String str) {
        if (str.length() < 2) {
            return false;
        }
        int idx = str.indexOf("bad");
        return idx == 1 || idx == 0;
    }
}
