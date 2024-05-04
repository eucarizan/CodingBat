public class StringE {
    public static boolean stringE(String str) {
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'e') {
                count++;
            }
        }

        return count <= 3 && count >= 1;
    }
}
