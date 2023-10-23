public class Max1020 {
    public static int max1020(int a, int b) {
        final int min = 10;
        final int max = 20;

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a >= min && a <= max) return a;
        if (b >= min && b <= max) return b;

        return 0;
    }
}
