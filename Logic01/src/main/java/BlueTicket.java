public class BlueTicket {
    public static int blueTicket(int a, int b, int c) {
        int aB = a + b;
        int aC = a + c;
        int bC = b + c;

        if (aB == 10 || aC == 10 || bC == 10) {
            return 10;
        }

        if (aB >= 10 + aC || aB >= 10 + bC) {
            return 5;
        }

        return 0;
    }
}
