public class RoundSum {
    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(int num) {
        int digit = num % 10;

        if (10 - digit <= 5) {
            return num + (10 - digit);
        }
        return num - digit;
    }
}
