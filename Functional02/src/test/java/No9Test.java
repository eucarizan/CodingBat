import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.No9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class No9Test {
    @ParameterizedTest(name = "{0} -- no9({1}) == {2}")
    @DisplayName("no9 test")
    @CsvSource(value = {
            "test1 : 1, 2, 19 : [1, 2]",
            "test2 : 9, 19, 29, 3 : [3]",
            "test3 : 1, 2, 3 : [1, 2, 3]",
            "test4 : 45, 99, 90, 28, 13, 999, 0 : [45, 90, 28, 13, 0]",
            "test5 : '' : []",
            "test6 : 9 : []",
            "test7 : 0, 9, 0 : [0, 0]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<Integer> param;

        if (input.isEmpty()) {
            param = List.of();
        } else {
            param = Arrays.stream(input.split(", "))
                    .map(Integer::parseInt).toList();
        }

        var result = No9.no9(param).toString();

        assertEquals(expected, result);
    }
}