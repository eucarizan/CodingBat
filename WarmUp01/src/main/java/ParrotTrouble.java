public class ParrotTrouble {
    public static boolean isInTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }
}
