public class WithoutDoubles {
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            return die1 + 1 > 6 ? 1 + die2 : die1 + 1 + die2;
        }
        return die1 + die2;
    }
}
