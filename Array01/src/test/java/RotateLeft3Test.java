import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class RotateLeft3Test {
    @ParameterizedTest(name = "{0} -- rotateLeft3({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : [2, 3, 1]",
            "test2 : 5, 11, 9 : [11, 9, 5]",
            "test3 : 7, 0, 0 : [0, 0, 7]",
            "test4 : 1, 2, 1 : [2, 1, 1]",
            "test5 : 0, 0, 1 : [0, 1, 0]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(RotateLeft3.rotateLeft3(param)); // .toString()

        assertEquals(expected, result);
    }
}