import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Array667Test {
    @ParameterizedTest(name = "{0} -- array667({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 6, 6, 2 : 1",
            "test2 : 6, 6, 2, 6 : 1",
            "test3 : 6, 7, 2, 6 : 1",
            "test4 : 6, 6, 2, 6, 7 : 2",
            "test5 : 1, 6, 3 : 0",
            "test6 : 6, 1 : 0",
            "test7 : 3, 6, 7, 6 : 1",
            "test8 : 3, 6, 6, 7 : 2",
            "test9 : 6, 3, 6, 6 : 1",
            "test10 : 6, 7, 6, 6 : 2",
            "test11 : 1, 2, 3, 5, 6 : 0",
            "test12 : 1, 2, 3, 6, 6 : 1",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Array667.array667(param);

        assertEquals(expected, result);
    }
}