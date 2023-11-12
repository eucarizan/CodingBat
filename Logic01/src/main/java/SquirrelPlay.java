public class SquirrelPlay {
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        int low = 60;
        int high = isSummer ? 100 : 90;
        return temp >= low && temp <= high;
    }
}
