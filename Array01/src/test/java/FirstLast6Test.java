import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class FirstLast6Test {
    @ParameterizedTest(name = "{0} -- firstLast6({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 6 : true",
            "test2 : 6, 1, 2, 3 : true",
            "test3 : 13, 6, 1, 2, 3 : false",
            "test4 : 13, 6, 1, 2, 6 : true",
            "test5 : 3, 2, 1 : false",
            "test6 : 3, 6, 1 : false",
            "test7 : 3, 6 : true",
            "test8 : 6 : true",
            "test9 : 3 : false",
            "test10 : 5, 6 : true",
            "test11 : 5, 5 : false",
            "test12 : 1, 2, 3, 4, 6 : true",
            "test13 : 1, 2, 3, 4 : false",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = FirstLast6.firstLast6(param);

        assertEquals(expected, result);
    }
}