public class Front22 {
    public static String front22(String str) {
        String front;

        if (str.length() < 2) {
            front = str;
        } else {
            front = str.substring(0, 2);
        }

        return front + str + front;
    }
}
