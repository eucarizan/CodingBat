import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.NoZ;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class NoZTest {
    @ParameterizedTest(name = "{0} -- noZ({1}) == {2}")
    @DisplayName("noZ test")
    @CsvSource(value = {
            "test1 : aaa, bbb, aza : [aaa, bbb]",
            "test2 : hziz, hzello, hi : [hi]",
            "test3 : hello, howz, are, youz : [hello, are]",
            "test4 : '' : []",
            "test5 : x, y, z : [x, y]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<String> param;

        if (input.isEmpty()) {
            param = List.of();
        } else {
            param = Arrays.stream(input.split(", ")).toList();
        }

        var result = NoZ.noZ(param).toString();

        assertEquals(expected, result);
    }
}