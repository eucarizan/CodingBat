import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Has271Test {
    @ParameterizedTest(name = "{0} -- has271({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 7, 1 : true",
            "test2 : 1, 2, 8, 1 : false",
            "test3 : 2, 7, 1 : true",
            "test4 : 3, 8, 2 : true",
            "test5 : 2, 7, 3 : true",
            "test6 : 2, 7, 4 : false",
            "test7 : 2, 7, -1 : true",
            "test8 : 2, 7, -2 : false",
            "test9 : 4, 5, 3, 8, 0 : true",
            "test10 : 2, 7, 5, 10, 4 : true",
            "test11 : 2, 7, -2, 4, 9, 3 : true",
            "test12 : 2, 7, 5, 10, 1 : false",
            "test13 : 2, 7, -2, 4, 10, 2 : false",
            "test14 : 1, 1, 4, 9, 0 : false",
            "test15 : 1, 1, 4, 9, 4, 9, 2 : true",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Has271.has271(param);

        assertEquals(expected, result);
    }
}