public class AlarmClock {
    public static String alarmClock(int day, boolean vacation) {
        String weekday = vacation ? "10:00" : "7:00";
        String weekend = vacation ? "off" : "10:00";
        return day == 0 || day == 6 ? weekend : weekday;
    }
}
