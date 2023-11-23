public class LastDigit {
    public static boolean lastDigit(int a, int b, int c) {
        boolean aB = a % 10 == b % 10;
        boolean bC = b % 10 == c % 10;
        boolean aC = a % 10 == c % 10;
        return aB || bC || aC;
    }
}
