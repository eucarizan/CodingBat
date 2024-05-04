public class CloseFar {
    public static boolean closeFar(int a, int b, int c) {
        return close(a, b) && far(c, a, b) || close(a, c) && far(b, a, c);
    }

    private static boolean close(int a, int b) {
        return Math.abs(a - b) == 0 || Math.abs(a - b) == 1;
    }

    private static boolean far(int a, int b, int c) {
        return Math.abs(a - b) >= 2 && Math.abs(a - c) >= 2;
    }
}
