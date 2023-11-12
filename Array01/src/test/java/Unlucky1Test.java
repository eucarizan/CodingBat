import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Unlucky1Test {
    @ParameterizedTest(name = "{0} -- unlucky1({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 3, 4, 5 : true",
            "test2 : 2, 1, 3, 4, 5 : true",
            "test3 : 1, 1, 1 : false",
            "test4 : 1, 3, 1 : true",
            "test5 : 1, 1, 3 : true",
            "test6 : 1, 2, 3 : false",
            "test7 : 3, 3, 3 : false",
            "test8 : 1, 3 : true",
            "test9 : 1, 4 : false",
            "test10 : 1 : false",
            "test11 : 1, 1, 1, 3, 1 : false",
            "test12 : 1, 1, 3, 1, 1 : true",
            "test13 : 1, 1, 1, 1, 3 : true",
            "test14 : 1, 4, 1, 5 : false",
            "test15 : 1, 1, 2, 3 : false",
            "test16 : 2, 3, 2, 1 : false",
            "test17 : 2, 3, 1, 3 : true",
            "test18 : 1, 2, 3, 4, 1, 3 : true",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Unlucky1.unlucky1(param); // .toString()

        assertEquals(expected, result);
    }
}