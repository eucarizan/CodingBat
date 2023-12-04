public class XyBalance {
    public static boolean xyBalance(String str) {
        int flag = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'x') {
                flag++;
            } else if (ch == 'y') {
                flag *= 0;
            }
        }
        return flag == 0;
    }
}
