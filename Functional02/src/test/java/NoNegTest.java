import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.NoNeg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class NoNegTest {

    @ParameterizedTest(name = "{0} -- noNeg({1}) == {2}")
    @DisplayName("noNeg test")
    @CsvSource(value = {
            "test1 : 1, -2 : [1]",
            "test2 : -3, -3, 3, 3 : [3, 3]",
            "test3 : -1, -1, -1 : []",
            "test4 : '' : []",
            "test5 : 0, 1, 2 : [0, 1, 2]",
            "test6 : 3, -10, 1, -1, 4, -400 : [3, 1, 4]",
            "test7 : -1, 3, 1, -1, -10, -100, -111, 5 : [3, 1, 5]"
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

        var result = NoNeg.noNeg(param).toString();

        assertEquals(expected, result);
    }
}
