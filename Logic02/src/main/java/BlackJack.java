public class BlackJack {
    public static int blackjack(int a, int b) {
        int aVal = a > 21 ? 0 : a;
        int bVal = b > 21 ? 0 : b;
        return Math.max(aVal, bVal);
    }
}
