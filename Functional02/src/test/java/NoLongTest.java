import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.NoLong;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class NoLongTest {
    @ParameterizedTest(name = "{0} -- NoLong({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
        "test1 : this, not, too, long : [not, too]",
        "test2 : a, bbb, cccc : [a, bbb]",
        "test3 : cccc, cccc, cccc : []",
        "test4 : '' : []",
        "test5 : empty, empty : []",
        "test6 : a : [a]",
        "test7 : aaaa, bbb, ***, 333 : [bbb, ***, 333]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
        List<String> param;

        if (input.isEmpty()) {
            param = List.of();
        } else {
            param = Arrays.stream(input.split(", "))
                    .toList();
        }

        var result = NoLong.noLong(param).toString(); // .toString()

        assertEquals(expected, result);
    }
}