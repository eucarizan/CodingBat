import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Double23Test {
    @ParameterizedTest(name = "{0} -- double23({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 2, 2 : true",
            "test2 : 3, 3 : true",
            "test3 : 2, 3 : false",
            "test4 : 3, 2 : false",
            "test5 : 4, 5 : false",
            "test6 : 2 : false",
            "test7 : 3 : false",
            "test8 : 3, 4 : false",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Double23.double23(param); // .toString()

        assertEquals(expected, result);
    }
}