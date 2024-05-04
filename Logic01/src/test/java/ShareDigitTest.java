import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class ShareDigitTest {
    @ParameterizedTest(name = "{0} -- shareDigit({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 12 : 23 : true",
            "test2 : 12 : 43 : false",
            "test3 : 12 : 44 : false",
            "test4 : 23 : 12 : true",
            "test5 : 23 : 39 : true",
            "test6 : 23 : 19 : false",
            "test7 : 30 : 90 : true",
            "test8 : 30 : 91 : false",
            "test9 : 55 : 55 : true",
            "test10 : 55 : 44 : false",
    }, delimiter = ':')
    public void test(String name, int input, int param, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = ShareDigit.shareDigit(input, param); // .toString()

        assertEquals(expected, result);
    }
}