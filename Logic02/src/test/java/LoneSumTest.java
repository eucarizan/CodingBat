import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class LoneSumTest {
    @ParameterizedTest(name = "{0} -- loneSum({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1 : 2 : 3 : 6",
            "test2 : 3 : 2 : 3 : 2",
            "test3 : 3 : 3 : 3 : 0",
            "test4 : 9 : 2 : 2 : 9",
            "test5 : 2 : 2 : 9 : 9",
            "test6 : 2 : 9 : 2 : 9",
            "test7 : 2 : 9 : 3 : 14",
            "test8 : 4 : 2 : 3 : 9",
            "test9 : 1 : 3 : 1 : 3",
    }, delimiter = ':')
    public void test(String name, int input, int param, int c, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = LoneSum.loneSum(input, param, c); // .toString()

        assertEquals(expected, result);
    }
}