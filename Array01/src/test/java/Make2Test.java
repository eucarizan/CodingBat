import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Make2Test {
    @ParameterizedTest(name = "{0} -- make2({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 4, 5 : 1, 2, 3 : [4, 5]",
            "test2 : 4 : 1, 2, 3 : [4, 1]",
            "test3 : '' : 1, 2 : [1, 2]",
            "test4 : 1, 2 : '' : [1, 2]",
            "test5 : 3 : 1, 2, 3 : [3, 1]",
            "test6 : 3 : 1 : [3, 1]",
            "test7 : 3, 1, 4 : '' : [3, 1]",
            "test8 : 1 : 1 : [1, 1]",
            "test9 : 1, 2, 3 : 7, 8 : [1, 2]",
            "test10 : 7, 8 : 1, 2, 3 : [7, 8]",
            "test11 : 7 : 1, 2, 3 : [7, 1]",
            "test12 : 5, 4 : 2, 3, 7 : [5, 4]",
    }, delimiter = ':')
    public void test(String name, String input1, String input2, String expected) {
        int[] a = getArray(input1);
        int[] b = getArray(input2);

        var result = Arrays.toString(Make2.make2(a, b)); // .toString()

        assertEquals(expected, result);
    }

    private int[] getArray(String input) {
        if (input.isEmpty()) {
            return new int[] {};
        }
        return Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
    }
}