import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class SumLimitTest {
    @ParameterizedTest(name = "{0} -- sumLimit({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 2 : 3 : 5",
            "test2 : 8 : 3 : 8",
            "test3 : 8 : 1 : 9",
            "test4 : 11 : 39 : 50",
            "test5 : 11 : 99 : 11",
            "test6 : 0 : 0 : 0",
            "test7 : 99 : 0 : 99",
            "test8 : 99 : 1 : 99",
            "test9 : 123 : 1 : 124",
            "test10 : 1 : 123 : 1",
            "test11 : 23 : 60 : 83",
            "test12 : 23 : 80 : 23",
            "test13 : 9000 : 1 : 9001",
            "test14 : 90000000 : 1 : 90000001",
            "test15 : 9000 : 1000 : 9000",
    }, delimiter = ':')
    public void test(String name, int input, int param, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = SumLimit.sumLimit(input, param); // .toString()

        assertEquals(expected, result);
    }
}