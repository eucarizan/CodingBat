import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class SameFirstLastTest {
    @ParameterizedTest(name = "{0} -- sameFirstLast({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : false",
            "test2 : 1, 2, 3, 1 : true",
            "test3 : 1, 2, 1 : true",
            "test4 : 7 : true",
            "test5 : 1, 2, 3, 4, 5, 1 : true",
            "test6 : 1, 2, 3, 4, 5, 13 : false",
            "test7 : 13, 2, 3, 4, 5, 13 : true",
            "test8 : 7, 7 : true",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = SameFirstLast.sameFirstLast(param);

        assertEquals(expected, result);
    }
}