import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class BiggerTwoTest {
    @ParameterizedTest(name = "{0} -- biggerTwo({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2 : 3, 4 : [3, 4]",
            "test2 : 3, 4 : 1, 2 : [3, 4]",
            "test3 : 1, 1 : 1, 2 : [1, 2]",
            "test4 : 2, 1 : 1, 1 : [2, 1]",
            "test5 : 2, 2 : 1, 3 : [2, 2]",
            "test6 : 1, 3 : 2, 2 : [1, 3]",
            "test7 : 6, 7 : 3, 1 : [6, 7]",
    }, delimiter = ':')
    public void test(String name, String a, String b, String expected) {
        int[] arrA = Arrays.stream(a.split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] arrB = Arrays.stream(b.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(BiggerTwo.biggerTwo(arrA, arrB)); // .toString()

        assertEquals(expected, result);
    }
}