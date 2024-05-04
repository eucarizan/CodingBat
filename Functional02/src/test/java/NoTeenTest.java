import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.NoTeen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class NoTeenTest {
    @ParameterizedTest(name = "{0} -- noTeen({1}) == {2}")
    @DisplayName("noTeen test")
    @CsvSource(value = {
            "test1 : 12, 13, 19, 20 : [12, 20]",
            "test2 : 1, 14, 1 : [1, 1]",
            "test3 : 15 : []",
            "test4 : -15 : [-15]",
            "test5 : '' : []",
            "test6 : 0, 1, 2, -3 : [0, 1, 2, -3]",
            "test7 : 15, 17, 19, 21, 19 : [21]",
            "test8 : -16, 2, 15, 3, 16, 25 : [-16, 2, 3, 25]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<Integer> param;

        if (input.isEmpty()) {
            param = List.of();
        } else {
            param = Arrays.stream(input.split(", "))
                    .map(Integer::parseInt).toList();
        }

        var result = NoTeen.noTeen(param).toString();

        assertEquals(expected, result);
    }
}