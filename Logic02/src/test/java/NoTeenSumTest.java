import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class NoTeenSumTest {
    @ParameterizedTest(name = "{0} -- noTeenSum({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : 1 : 2 : 3 : 6",
            "test2 : 2 : 13 : 1 : 3",
            "test3 : 2 : 1 : 14 : 3",
            "test4 : 2 : 1 : 15 : 18",
            "test5 : 2 : 1 : 16 : 19",
            "test6 : 2 : 1 : 17 : 3",
            "test7 : 17 : 1 : 2 : 3",
            "test8 : 2 : 15 : 2 : 19",
            "test9 : 16 : 17 : 18 : 16",
            "test10 : 17 : 18 : 19 : 0",
            "test11 : 15 : 16 : 1 : 32",
            "test12 : 15 : 15 : 19 : 30",
            "test13 : 15 : 19 : 16 : 31",
            "test14 : 5 : 17 : 18 : 5",
            "test15 : 17 : 18 : 16 : 16",
            "test16 : 17 : 19 : 18 : 0",
    }, delimiter = ':')
    public void test(String name, int input, int param, int c, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = NoTeenSum.noTeenSum(input, param, c); // .toString()

        assertEquals(expected, result);
    }
}