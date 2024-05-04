public class Less20 {
    public static boolean less20(int n) {
        return n >= 0 && (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }
}
