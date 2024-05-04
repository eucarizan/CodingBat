public class CountHi {
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ("hi".equals(str.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }
}
