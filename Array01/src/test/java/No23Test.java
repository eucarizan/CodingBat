import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class No23Test {
    @ParameterizedTest(name = "{0} -- no23({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 4, 5 : true",
            "test2 : 4, 2 : false",
            "test3 : 3, 5 : false",
            "test4 : 1, 9 : true",
            "test5 : 2, 9 : false",
            "test6 : 1, 3 : false",
            "test7 : 1, 1 : true",
            "test8 : 2, 2 : false",
            "test9 : 3, 3 : false",
            "test10 : 7, 8 : true",
            "test11 : 8, 7 : true",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = No23.no23(param); // .toString()

        assertEquals(expected, result);
    }
}