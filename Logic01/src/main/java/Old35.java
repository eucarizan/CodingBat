public class Old35 {
    public static boolean old35(int n) {
        boolean by3 = n % 3 == 0;
        boolean by5 = n % 5 == 0;
        return by3 && !by5 || !by3 && by5;
    }
}
