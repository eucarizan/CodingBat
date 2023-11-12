import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Front11Test {
    @ParameterizedTest(name = "{0} -- front11({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : 7, 9, 8 : [1, 7]",
            "test2 : 1 : 2 : [1, 2]",
            "test3 : 1, 7 : '' : [1]",
            "test4 : '' : 2, 8 : [2]",
            "test5 : '' : '' : []",
            "test6 : 3 : 1, 4, 1, 9 : [3, 1]",
            "test7 : 1, 4, 1, 9 : '' : [1]",
    }, delimiter = ':')
    public void test(String name, String a1, String b1, String expected) {
        int[] a = getArray(a1);
        int[] b = getArray(b1);

        var result = Arrays.toString(Front11.front11(a, b)); // .toString()

        assertEquals(expected, result);
    }

    private int[] getArray(String input) {
        if (input.isEmpty()) {
            return new int[] {};
        }
        return Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
    }
}