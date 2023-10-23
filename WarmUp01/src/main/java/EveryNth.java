public class EveryNth {
    public static String everyNth(String str, int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i = n; i < str.length(); i += n) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
