public class ExtraFront {
    public static String extraFront(String str) {
        if (str.length() > 2) {
            String out = str.substring(0, 2);
            return out + out + out;
        }

        return str + str + str;
    }
}
