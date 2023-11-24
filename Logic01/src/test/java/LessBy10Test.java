import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class LessBy10Test {
    @ParameterizedTest(name = "{0} -- lessBy10({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1 : 7 : 11 : true",
            "test2 : 1 : 7 : 10 : false",
            "test3 : 11 : 1 : 7 : true",
            "test4 : 10 : 7 : 1 : false",
            "test5 : -10 : 2 : 2 : true",
            "test6 : 2 : 11 : 11 : false",
            "test7 : 3 : 3 : 30 : true",
            "test8 : 3 : 3 : 3 : false",
            "test9 : 10 : 1 : 11 : true",
            "test10 : 10 : 11 : 1 : true",
            "test11 : 10 : 11 : 2 : false",
            "test12 : 3 : 30 : 3 : true",
            "test13 : 2 : 2 : -8 : true",
            "test14 : 2 : 8 : 12 : true",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = LessBy10.lessBy10(a, b, c); // .toString()

        assertEquals(expected, result);
    }
}