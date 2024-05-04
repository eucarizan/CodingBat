import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Start1Test {
    @ParameterizedTest(name = "{0} -- start1({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : 1, 3 : 2",
            "test2 : 7, 2, 3 : 1 : 1",
            "test3 : 1, 2 : '' : 1",
            "test4 : '' : 1, 2 : 1",
            "test5 : 7 : '' : 0",
            "test6 : 7 : 1 : 1",
            "test7 : 1 : 1 : 2",
            "test8 : 7 : 8 : 0",
            "test9 : '' : '' : 0",
            "test10 : 1, 3 : 1 : 2",
    }, delimiter = ':')
    public void test(String name, String a, String b, int expected) {
        int[] arrA = getArray(a);
        int[] arrB = getArray(b);

        var result = Start1.start1(arrA, arrB); // .toString()

        assertEquals(expected, result);
    }

    private int[] getArray(String a) {
        if (a.isEmpty()) {
            return new int[] {};
        }
        return Arrays.stream(a.split(", ")).mapToInt(Integer::parseInt).toArray();
    }
}