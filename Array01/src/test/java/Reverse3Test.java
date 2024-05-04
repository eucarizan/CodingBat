import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Reverse3Test {
    @ParameterizedTest(name = "{0} -- reverse3({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : [3, 2, 1]",
            "test2 : 5, 11, 9 : [9, 11, 5]",
            "test3 : 7, 0, 0 : [0, 0, 7]",
            "test4 : 2, 1, 2 : [2, 1, 2]",
            "test5 : 1, 2, 1 : [1, 2, 1]",
            "test6 : 2, 11, 3 : [3, 11, 2]",
            "test7 : 0, 6, 5 : [5, 6, 0]",
            "test8 : 7, 2, 3 : [3, 2, 7]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(Reverse3.reverse3(param));

        assertEquals(expected, result);
    }
}