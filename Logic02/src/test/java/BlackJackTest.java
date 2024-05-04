import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class BlackJackTest {
    @ParameterizedTest(name = "{0} -- blackjack({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : 19 : 21 : 21",
            "test2 : 21 : 19 : 21",
            "test3 : 19 : 22 : 19",
            "test4 : 22 : 19 : 19",
            "test5 : 22 : 50 : 0",
            "test6 : 22 : 22 : 0",
            "test7 : 33 : 1 : 1",
            "test8 : 1 : 2 : 2",
            "test9 : 34 : 33 : 0",
            "test10 : 17 : 19 : 19",
            "test11 : 18 : 17 : 18",
            "test12 : 16 : 23 : 16",
            "test13 : 3 : 4 : 4",
            "test14 : 3 : 2 : 3",
            "test15 : 21 : 20 : 21",
    }, delimiter = ':')
    public void test(String name, int input, int param, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = BlackJack.blackjack(input, param); // .toString()

        assertEquals(expected, result);
    }
}