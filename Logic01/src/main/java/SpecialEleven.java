public class SpecialEleven {
    public static boolean specialEleven(int n) {
        return n >= 0 && (n % 11 == 0 || (n - 1) % 11 == 0);
    }
}
