public class DoubleChar {
    public static String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            sb.append(ch).append(ch);
        }
        return sb.toString();
    }
}
