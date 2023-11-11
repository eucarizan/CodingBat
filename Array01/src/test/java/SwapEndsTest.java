import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class SwapEndsTest {
    @ParameterizedTest(name = "{0} -- swapEnds({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3, 4 : [4, 2, 3, 1]",
            "test2 : 1, 2, 3 : [3, 2, 1]",
            "test3 : 8, 6, 7, 9, 5 : [5, 6, 7, 9, 8]",
            "test4 : 3, 1, 4, 1, 5, 9 : [9, 1, 4, 1, 5, 3]",
            "test5 : 1, 2 : [2, 1]",
            "test6 : 1 : [1]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(SwapEnds.swapEnds(param)); // .toString()

        assertEquals(expected, result);
    }
}