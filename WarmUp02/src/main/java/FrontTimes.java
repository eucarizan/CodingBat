public class FrontTimes {
    public static String frontTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();

        String front = str.length() < 3 ? str : str.substring(0, 3);

//        for (int i = 0; i < n; i++) {
//            sb.append(front);
//        }
        sb.append(front.repeat(Math.max(0, n)));

        return sb.toString();
    }

}
