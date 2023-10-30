import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class ArrayCount9Test {
    @ParameterizedTest(name = "{0} -- arrayCount9({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 9 : 1",
            "test2 : 1, 9, 9 : 2",
            "test3 : 1, 9, 9, 3, 9 : 3",
            "test4 : 1, 2, 3 : 0",
            "test5 : 4, 2, 4, 3, 1 : 0",
            "test6 : 9, 2, 4, 3, 1 : 1",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = ArrayCount9.arrayCount9(param);

        assertEquals(expected, result);
    }
}