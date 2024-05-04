public class Diff21 {
    public static int diff21(int n) {
        int ans = Math.abs(21 - n);
        return n > 21 ? ans * 2 : ans;
    }
}
