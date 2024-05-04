public class EvenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {
        int min = a;
        int mid = b;
        int max = c;

        if (b - a < 1 && c - a < 1) {
            max = a;
            if (b - c < 1) {
                mid = c;
                min = b;
            }
        }

        if (a - b < 1 && c - b < 1) {
            max = b;
            if (c - a < 1) {
                mid = a;
                min = c;
            }
        }

        if (c > a && c > b && a > b) {
            mid = a;
            min = b;
        }

        return mid - min == max - mid;
    }
}
