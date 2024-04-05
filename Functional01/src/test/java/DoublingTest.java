import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
public class DoublingTest {

    @ParameterizedTest(name = "{0} -- doubling({1}) == {2}")
    @DisplayName("doubling test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : [2, 4, 6]",
            "test2 : 6, 8, 6, 8, -1 : [12, 16, 12, 16, -2]",
            "test3 : '' : []",
            "test4 : 5 : [10]",
            "test5 : 5, 10 : [10, 20]",
            "test6 : 8, -5, 7, 3, 109 : [16, -10, 14, 6, 218]",
            "test7 : 6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2 : [12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4]",
            "test8 : 3, 1, 4, 1, 5, 9 : [6, 2, 8, 2, 10, 18]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<Integer> param;
        if (input.isBlank()) {
            param = List.of();
        } else {
            param = Arrays.stream(input.split(", "))
                    .map(Integer::parseInt)
                    .toList();
        }

        var result = Doubling.doubling(param).toString();

        assertEquals(expected, result);
    }
}
