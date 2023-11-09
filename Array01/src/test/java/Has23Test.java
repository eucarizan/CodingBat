import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Has23Test {
    @ParameterizedTest(name = "{0} -- has23({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 2, 5 : true",
            "test2 : 4, 3 : true",
            "test3 : 4, 5 : false",
            "test4 : 2, 2 : true",
            "test5 : 3, 2 : true",
            "test6 : 3, 3 : true",
            "test7 : 7, 7 : false",
            "test8 : 3, 9 : true",
            "test9 : 9, 5 : false",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Has23.has23(param); // .toString()

        assertEquals(expected, result);
    }
}