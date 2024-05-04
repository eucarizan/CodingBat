public class CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int ticket = 0;
        int lo1 = isBirthday? 66 : 61;
        int hi1 = isBirthday? 85 : 80;
        int lo2 = isBirthday? 86 : 81;

        if (speed >= lo1 && speed <= hi1) {
            ticket = 1;
        }

        if (speed >= lo2) {
            ticket = 2;
        }

        return ticket;
    }
}
