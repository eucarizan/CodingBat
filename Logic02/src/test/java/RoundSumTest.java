import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class RoundSumTest {
    @ParameterizedTest(name = "{0} -- roundSum({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : 16 : 17 : 18 : 60",
            "test2 : 12 : 13 : 14 : 30",
            "test3 : 6 : 4 : 4 : 10",
            "test4 : 4 : 6 : 5 : 20",
            "test5 : 4 : 4 : 6 : 10",
            "test6 : 9 : 4 : 4 : 10",
            "test7 : 0 : 0 : 1 : 0",
            "test8 : 0 : 9 : 0 : 10",
            "test9 : 10 : 10 : 19 : 40",
            "test10 : 20 : 30 : 40 : 90",
            "test11 : 45 : 21 : 30 : 100",
            "test12 : 23 : 11 : 26 : 60",
            "test13 : 23 : 24 : 25 : 70",
            "test14 : 25 : 24 : 25 : 80",
            "test15 : 23 : 24 : 29 : 70",
            "test16 : 11 : 24 : 36 : 70",
            "test17 : 24 : 36 : 32 : 90",
            "test18 : 14 : 12 : 26 : 50",
            "test19 : 12 : 10 : 24 : 40",
    }, delimiter = ':')
    public void test(String name, int input, int param, int c, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = RoundSum.roundSum(input, param, c); // .toString()

        assertEquals(expected, result);
    }
}