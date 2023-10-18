public class StartOz {
    public static String startOz(String str) {
        String result = "";

        if (!str.isEmpty() && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }

}
