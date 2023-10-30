public class CountXX {
    public static int countXX(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            String pair = str.substring(i, i+2);
            if ("xx".equals(pair)) {
                count++;
            }
        }

        return count;
    }

}
