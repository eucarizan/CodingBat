public class More20 {
    public static boolean more20(int n) {
        return n >= 0 && (n - 1) % 20 == 0 || (n - 2) % 20 == 0;
    }
}
