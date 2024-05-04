public class StringSplosion {
    public static String stringSplosion(String str) {
        if (str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str, 0, i + 1);
        }

        return sb.toString();
    }

}
