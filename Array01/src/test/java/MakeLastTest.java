import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MakeLastTest {
    @ParameterizedTest(name = "{0} -- makeLast({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 4, 5, 6 : [0, 0, 0, 0, 0, 6]",
            "test2 : 1, 2 : [0, 0, 0, 2]",
            "test3 : 3 : [0, 3]",
            "test4 : 0 : [0, 0]",
            "test5 : 7, 7, 7 : [0, 0, 0, 0, 0, 7]",
            "test6 : 3, 1, 4 : [0, 0, 0, 0, 0, 4]",
            "test7 : 1, 2, 3, 4 : [0, 0, 0, 0, 0, 0, 0, 4]",
            "test8 : 1, 2, 3, 0 : [0, 0, 0, 0, 0, 0, 0, 0]",
            "test9 : 2, 4 : [0, 0, 0, 4]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(MakeLast.makeLast(param)); // .toString()

        assertEquals(expected, result);
    }
}