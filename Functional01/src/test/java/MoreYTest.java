import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.MoreY;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class MoreYTest {
    @ParameterizedTest(name = "{0} -- moreY({1}) == {2}")
    @DisplayName("moreY test")
    @CsvSource(value = {
            "test1 : a, b, c : [yay, yby, ycy]",
            "test2 : hello, there : [yhelloy, ytherey]",
            "test3 : yay : [yyayy]",
            "test4 : a, xx : [yay, yxxy]",
            "test5 : '' : []",
            "test6 : xx, yy, zz : [yxxy, yyyy, yzzy]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<String> param;

        if (input.isEmpty()) {
            param = List.of();
        } else {
            param= Arrays.stream(input.split(", ")).toList();
        }

        var result = MoreY.moreY(param).toString();

        assertEquals(expected, result);
    }
}