public class RedTicket {
    public static int redTicket(int a, int b, int c) {
        int sum = a + b + c;
        if (sum == 6 && a == b && b == c) {
            return 10;
        }

        if (a == b && b == c && (sum == 3 || sum == 0)) {
            return 5;
        }

        if (a == b || a == c) {
            return 0;
        }

        return 1;
    }
}
