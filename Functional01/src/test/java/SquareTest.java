import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class SquareTest {
    @ParameterizedTest(name = "{0} -- square({1}) == {2}")
    @DisplayName("square test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : [1, 4, 9]",
            "test2 : 6, 8, -6, -8, 1 : [36, 64, 36, 64, 1]",
            "test3 : '' : []",
            "test4 : 12 : [144]",
            "test5 : 5, 10 : [25, 100]",
            "test6 : 6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2 : [36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<Integer> param;

        if (input.isEmpty()) {
            param = List.of();
        } else {
            param = Arrays.stream(input.split(", "))
                    .map(Integer::parseInt)
                    .toList();
        }

        var result = Square.square(param).toString(); // .toString()

        assertEquals(expected, result);
    }
}