import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MakeMiddleTest {
    @ParameterizedTest(name = "{0} -- makeMiddle({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3, 4 : [2, 3]",
            "test2 : 7, 1, 2, 3, 4, 9 : [2, 3]",
            "test3 : 1, 2 : [1, 2]",
            "test4 : 5, 2, 4, 7 : [2, 4]",
            "test5 : 9, 0, 4, 3, 9, 1 : [4, 3]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(MakeMiddle.makeMiddle(param)); // .toString()

        assertEquals(expected, result);
    }
}