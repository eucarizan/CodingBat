public class In3050 {
    public static boolean in3050(int a, int b) {
        final int min1 = 30;
        final int max1 = 40;
        final int max2 = 50;

        boolean aIn3040 = a >= min1 && a <= max1;
        boolean aIn4050 = a >= max1 && a <= max2;
        boolean bIn3040 = b >= min1 && b <= max1;
        boolean bIn4050 = b >= max1 && b <= max2;

        return aIn3040 && bIn3040 || aIn4050 && bIn4050;
    }

}
