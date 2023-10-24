public class StringBits {
    public static String stringBits(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i+=2) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
