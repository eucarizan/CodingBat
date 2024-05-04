import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Fix23Test {
    @ParameterizedTest(name = "{0} -- fix23({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : [1, 2, 0]",
            "test2 : 2, 3, 5 : [2, 0, 5]",
            "test3 : 1, 2, 1 : [1, 2, 1]",
            "test4 : 3, 2, 1 : [3, 2, 1]",
            "test5 : 2, 2, 3 : [2, 2, 0]",
            "test6 : 2, 3, 3 : [2, 0, 3]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(Fix23.fix23(param)); // .toString()

        assertEquals(expected, result);
    }
}