public class InOrder {
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        return (bOk || a < b) && b < c;
    }
}
