public class Close10 {
    public static int close10(int a, int b) {
        final int ten = 10;
        int aDiff = Math.abs(a - ten);
        int bDiff = Math.abs(b - ten);
        return aDiff == bDiff ? 0 : aDiff < bDiff ? a : b;
    }
}
