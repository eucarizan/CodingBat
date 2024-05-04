public class DeFront {
    public static String deFront(String str) {
        StringBuilder start = new StringBuilder();

        if ('a' == str.charAt(0)) {
            start.append("a");
        }
        if ('b' == str.charAt(1)) {
            start.append("b");
        }


        return start + str.substring(2);
    }
}
