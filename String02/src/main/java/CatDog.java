public class CatDog {
    public static boolean catDog(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if ("cat".equals(str.substring(i, i + 3))) {
                count++;
            } else if ("dog".equals(str.substring(i, i + 3))) {
                count--;
            }
        }
        return count == 0;
    }
}
