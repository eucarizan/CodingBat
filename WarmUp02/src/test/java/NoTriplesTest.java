import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class NoTriplesTest {
    @ParameterizedTest(name = "{0} -- noTriples({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 1, 2, 2, 1 : true",
            "test2 : 1, 1, 2, 2, 2, 1 : false",
            "test3 : 1, 1, 1, 2, 2, 2, 1 : false",
            "test4 : 1, 1, 2, 2, 1, 2, 1 : true",
            "test5 : 1, 2, 1 : true",
            "test6 : 1, 1, 1 : false",
            "test7 : 1, 1 : true",
            "test8 : 1 : true",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = NoTriples.noTriples(param);

        assertEquals(expected, result);
    }
}