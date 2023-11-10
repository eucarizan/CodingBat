public class BiggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {
        return a[0] + a[1] >= b[0] + b[1] ? a : b;
    }
}
