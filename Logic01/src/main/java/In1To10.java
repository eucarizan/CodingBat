public class In1To10 {
    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n >= 10 || n <= 1;
        }
        return n >= 1 && n <= 10;
    }
}
