public class DoubleX {
    public static boolean doubleX(String str) {
        // int i = 0;
        // while(i < str.length() - 1) {
        //   if (str.charAt(i) != 'x') {
        //     i++;
        //     continue;
        //   }
        //   return str.charAt(i + 1) == 'x';
        // }
        // return false;
        int i = str.indexOf("x");

        return i != -1 && str.substring(i).startsWith("xx");
    }
}
