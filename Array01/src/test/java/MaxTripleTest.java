import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MaxTripleTest {
    @ParameterizedTest(name = "{0} -- maxTriple({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : 3",
            "test2 : 1, 5, 3 : 5",
            "test3 : 5, 2, 3 : 5",
            "test4 : 1, 2, 3, 1, 1 : 3",
            "test5 : 1, 7, 3, 1, 5 : 5",
            "test6 : 5, 1, 3, 7, 1 : 5",
            "test7 : 5, 1, 7, 3, 7, 8, 1 : 5",
            "test8 : 5, 1, 7, 9, 7, 8, 1 : 9",
            "test9 : 5, 1, 7, 3, 7, 8, 9 : 9",
            "test10 : 2, 2, 5, 1, 1 : 5",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = MaxTriple.maxTriple(param); // .toString()

        assertEquals(expected, result);
    }
}