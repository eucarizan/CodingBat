import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MakeEndsTest {
    @ParameterizedTest(name = "{0} -- makeEnds({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : [1, 3]",
            "test2 : 1, 2, 3, 4 : [1, 4]",
            "test3 : 7, 4, 6, 2 : [7, 2]",
            "test4 : 1, 2, 2, 2, 2, 2, 2, 3 : [1, 3]",
            "test5 : 7, 4 : [7, 4]",
            "test6 : 7 : [7, 7]",
            "test7 : 5, 2, 9 : [5, 9]",
            "test8 : 2, 3, 4, 1 : [2, 1]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(MakeEnds.makeEnds(param));

        assertEquals(expected, result);
    }
}