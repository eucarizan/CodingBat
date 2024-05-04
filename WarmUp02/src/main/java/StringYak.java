public class StringYak {
    public static String stringYak(String str) {
        // return str.replaceAll("y[a-z]k", "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && 'y' == str.charAt(i) && 'k' == str.charAt(i + 2)) {
                i += 2;
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
