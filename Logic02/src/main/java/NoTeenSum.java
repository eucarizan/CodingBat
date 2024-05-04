public class NoTeenSum {
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    private static int fixTeen(int n) {
        return n <= 19 && n >= 13 && n != 16 && n != 15 ? 0 : n;
    }
}
