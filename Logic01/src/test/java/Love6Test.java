import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Love6Test {
    @ParameterizedTest(name = "{0} -- love6({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 6 : 4 : true",
            "test2 : 4 : 5 : false",
            "test3 : 1 : 5 : true",
            "test4 : 1 : 6 : true",
            "test5 : 1 : 8 : false",
            "test6 : 1 : 7 : true",
            "test7 : 7 : 5 : false",
            "test8 : 8 : 2 : true",
            "test9 : 6 : 6 : true",
            "test10 : -6 : 2 : false",
            "test11 : -4 : -10 : true",
            "test12 : -7 : 1 : false",
            "test13 : 7 : -1 : true",
            "test14 : -6 : 12 : true",
            "test15 : -2 : -4 : false",
            "test16 : 7 : 1 : true",
            "test17 : 0 : 9 : false",
            "test18 : 8 : 3 : false",
            "test19 : 3 : 3 : true",
            "test20 : 3 : 4 : false",
    }, delimiter = ':')
    public void test(String name, int input, int param, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Love6.love6(input, param); // .toString()

        assertEquals(expected, result);
    }
}