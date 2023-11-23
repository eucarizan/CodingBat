import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class LastDigitTest {
    @ParameterizedTest(name = "{0} -- lastDigit({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 23 : 19 : 13 : true",
            "test2 : 23 : 19 : 12 : false",
            "test3 : 23 : 19 : 3 : true",
            "test4 : 23 : 19 : 39 : true",
            "test5 : 1 : 2 : 3 : false",
            "test6 : 1 : 1 : 2 : true",
            "test7 : 1 : 2 : 2 : true",
            "test8 : 14 : 25 : 43 : false",
            "test9 : 14 : 25 : 45 : true",
            "test10 : 248 : 106 : 1002 : false",
            "test11 : 248 : 106 : 1008 : true",
            "test12 : 10 : 11 : 20 : true",
            "test13 : 0 : 11 : 0 : true",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = LastDigit.lastDigit(a, b, c); // .toString()

        assertEquals(expected, result);
    }
}