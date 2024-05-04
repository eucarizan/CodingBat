import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MidThreeTest {
    @ParameterizedTest(name = "{0} -- midThree({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3, 4, 5 : [2, 3, 4]",
            "test2 : 8, 6, 7, 5, 3, 0, 9 : [7, 5, 3]",
            "test3 : 1, 2, 3 : [1, 2, 3]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(MidThree.midThree(param)); // .toString()

        assertEquals(expected, result);
    }
}