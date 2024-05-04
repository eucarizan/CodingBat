public class BackAround {
    public static String backAround(String str) {
        char fix = str.charAt(str.length() - 1);

        return fix + str + fix;
    }
}
