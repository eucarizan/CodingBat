public class SumLimit {
    public static int sumLimit(int a, int b) {
        int sum = a + b;
        if (String.valueOf(sum).length() > String.valueOf(a).length()) {
            return a;
        }
        return sum;
    }
}
