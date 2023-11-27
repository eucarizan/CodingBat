public class MakeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
        if (goal > big * 5 + small) return false;
        return goal % 5 <= small;
    }
}
