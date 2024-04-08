import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.RightDigit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class RightDigitTest {
    @ParameterizedTest(name = "{0} -- rightDigit({1}) == {2}")
    @DisplayName("rightDigit test")
    @CsvSource(value = {
            "test1 : 1, 22, 93 : [1, 2, 3]",
            "test2 : 16, 8, 886, 8, 1 : [6, 8, 6, 8, 1]",
            "test3 : 10, 0 : [0, 0]",
            "test4 : '' : []",
            "test5 : 5, 10 : [5, 0]",
            "test6 : 5, 50, 500, 5000, 5000 : [5, 0, 0, 0, 0]",
            "test7 : 6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2 : [6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> param;

        if (input.isEmpty()) {
            param = List.of();
        } else {
            param = Arrays.stream(input.split(", "))
                    .map(Integer::parseInt).toList();
        }

        var result = RightDigit.rightDigit(param).toString(); // .toString()

        assertEquals(expected, result);
    }
}