import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Sum3Test {
    @ParameterizedTest(name = "{0} -- sum3({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : 6",
            "test2 : 5, 11, 2 : 18",
            "test3 : 7, 0, 0 : 7",
            "test4 : 1, 2, 1 : 4",
            "test5 : 1, 1, 1 : 3",
            "test6 : 2, 7, 2 : 11",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Sum3.sum3(param);

        assertEquals(expected, result);
    }
}