public class NoobThere {
    public static boolean noobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).matches("b.b")) {
                return true;
            }
        }
        return false;
    }
}
