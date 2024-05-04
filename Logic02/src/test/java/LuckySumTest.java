import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class LuckySumTest {
    @ParameterizedTest(name = "{0} -- luckySum({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : 1 : 2 : 3 : 6",
            "test2 : 1 : 2 : 13 : 3",
            "test3 : 1 : 13 : 3 : 1",
            "test4 : 1 : 13 : 13 : 1",
            "test5 : 6 : 5 : 2 : 13",
            "test6 : 13 : 2 : 3 : 0",
            "test7 : 13 : 2 : 13 : 0",
            "test8 : 13 : 13 : 2 : 0",
            "test9 : 9 : 4 : 13 : 13",
            "test10 : 8 : 13 : 2 : 8",
            "test11 : 7 : 2 : 1 : 10",
            "test12 : 3 : 3 : 13 : 6",
    }, delimiter = ':')
    public void test(String name, int input, int param, int c, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = LuckySum.luckySum(input, param, c); // .toString()

        assertEquals(expected, result);
    }
}