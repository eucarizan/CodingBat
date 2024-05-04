public class MakeChocolate {
    public static int makeChocolate(int small, int big, int goal) {
        int count = 0;
        while (goal >= 5 && big > 0) {
            goal -= 5;
            big--;
        }
        while (goal > 0 && small > 0) {
            goal--;
            small--;
            count++;
        }
        if (goal == 0) {
            return count;
        }
        return -1;
    }
}
