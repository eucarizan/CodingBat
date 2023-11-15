import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class TeenSumTest {
    @ParameterizedTest(name = "{0} -- teenSum({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 3 : 4 : 7",
            "test2 : 10 : 13 : 19",
            "test3 : 13 : 2 : 19",
            "test4 : 3 : 19 : 19",
            "test5 : 13 : 13 : 19",
            "test6 : 10 : 10 : 20",
            "test7 : 6 : 14 : 19",
            "test8 : 15 : 2 : 19",
            "test9 : 19 : 19 : 19",
            "test10 : 19 : 20 : 19",
            "test11 : 2 : 18 : 19",
            "test12 : 12 : 4 : 16",
            "test13 : 2 : 20 : 22",
            "test14 : 2 : 17 : 19",
            "test15 : 2 : 16 : 19",
            "test16 : 6 : 7 : 13",
    }, delimiter = ':')
    public void test(String name, int input, int param, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = TeenSum.teenSum(input, param); // .toString()

        assertEquals(expected, result);
    }
}