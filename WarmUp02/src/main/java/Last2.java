public class Last2 {
    public static int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        // String s = str.charAt(str.length()-2) + "" + str.charAt(str.length()-1);
        String end = str.substring(str.length() - 2);
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            // String curr = str.charAt(i) + "" + str.charAt(i+1);
            String curr = str.substring(i, i+2);
            if (curr.equals(end)) {
                count++;
            }
        }

        return count;
    }
}
