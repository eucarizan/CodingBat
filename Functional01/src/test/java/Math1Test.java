import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.Math1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class Math1Test {
    @ParameterizedTest(name = "{0} -- math1({1}) == {2}")
    @DisplayName("math1 test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : [20, 30, 40]",
            "test2 : 6, 8, 6, 8, 1 : [70, 90, 70, 90, 20]",
            "test3 : 10 : [110]",
            "test4 : '' : []",
            "test5 : 5, 10 : [60, 110]",
            "test6 : -1, -2, -3, -2, -1 : [0, -10, -20, -10, 0]",
            "test7 : 6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2 : [70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> param;

        if (input.isBlank()) {
            param = List.of();
        } else {
            param = Arrays.stream(input.split(", "))
                    .map(Integer::parseInt)
                    .toList();
        }

        var result = Math1.math1(param).toString(); // .toString()

        assertEquals(expected, result);
    }
}