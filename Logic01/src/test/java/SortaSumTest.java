import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class SortaSumTest {
    @ParameterizedTest(name = "{0} -- sortaSum({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 3 : 4 : 7",
            "test2 : 9 : 4 : 20",
            "test3 : 10 : 11 : 21",
            "test4 : 12 : -3 : 9",
            "test5 : -3 : 12 : 9",
            "test6 : 4 : 5 : 9",
            "test7 : 4 : 6 : 20",
            "test8 : 14 : 7 : 21",
            "test9 : 14 : 6 : 20",
    }, delimiter = ':')
    public void test(String name, int input, int param, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = SortaSum.sortaSum(input, param); // .toString()

        assertEquals(expected, result);
    }
}