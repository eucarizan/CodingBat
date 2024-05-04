public class WithoutX2 {
    public static String withoutX2(String str) {
        if (str.isEmpty()) {
            return str;
        }

        if (str.length() == 1 && str.startsWith("x")) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        if (str.charAt(0) != 'x') {
            sb.append(str.charAt(0));
        }

        if (str.charAt(1) != 'x') {
            sb.append(str.charAt(1));
        }

        if (str.length() > 2) {
            sb.append(str.substring(2));
        }

        return sb.toString();
    }
}
