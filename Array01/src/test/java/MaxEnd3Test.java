import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MaxEnd3Test {
    @ParameterizedTest(name = "{0} -- maxEnd3({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : [3, 3, 3]",
            "test2 : 11, 5, 9 : [11, 11, 11]",
            "test3 : 2, 11, 3 : [3, 3, 3]",
            "test4 : 11, 3, 3 : [11, 11, 11]",
            "test5 : 3, 11, 11 : [11, 11, 11]",
            "test6 : 2, 2, 2 : [2, 2, 2]",
            "test7 : 2, 11, 2 : [2, 2, 2]",
            "test8 : 0, 0, 1 : [1, 1, 1]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(MaxEnd3.maxEnd3(param));

        assertEquals(expected, result);
    }
}