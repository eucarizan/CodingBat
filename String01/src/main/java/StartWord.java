public class StartWord {
    public static String startWord(String str, String word) {
        if (!str.isEmpty() && word.length() == 1) {
            return str.substring(0, 1);
        }

        if (!str.isEmpty() && str.indexOf(word.substring(1)) == 1) {
            return str.substring(0, word.length());
        }

        return "";
    }
}
