public class NearTen {
    public static boolean nearTen(int num) {
        for (int i = num - 2; i <= num + 2; i++) {
            if (i % 10 == 0) {
                return true;
            }
        }
        return false;
    }
}
