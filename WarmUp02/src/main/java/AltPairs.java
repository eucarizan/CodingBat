public class AltPairs {
    public static String altPairs(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) {
            sb.append(str.charAt(i));
            if (i + 1 < str.length()) {
                sb.append(str.charAt(i + 1));
            }
        }

        return sb.toString();
    }
}
