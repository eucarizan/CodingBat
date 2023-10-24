public class StringTimes {
    public static String stringTimes(String str, int n) {
        return String.valueOf(str).repeat(Math.max(0, n));
    }
}

/*
StringBuilder sb = new StringBuilder();

for (int i = 0; i < n; i++) {
    sb.append(str);
}

return sb.toString();
 */