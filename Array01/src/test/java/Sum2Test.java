import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Sum2Test {
    @ParameterizedTest(name = "{0} -- sum2({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : 3",
            "test2 : 1, 1 : 2",
            "test3 : 1, 1, 1, 1 : 2",
            "test4 : 1, 2 : 3",
            "test5 : 1 : 1",
            "test6 : 4, 5, 6 : 9",
            "test7 : 4 : 4",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Sum2.sum2(param); // .toString()

        assertEquals(expected, result);
    }
}