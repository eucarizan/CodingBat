import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class SomeTest {
    @ParameterizedTest(name = "{0} -- array123({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test : 1, 1, 2, 3, 1 : true",
            "test : 1, 1, 2, 4, 1 : false",
            "test : 1, 1, 2, 1, 2, 3 : true",
            "test : 1, 1, 2, 1, 2, 1 : false",
            "test : 1, 2, 3, 1, 2, 3 : true",
            "test : 1, 2, 3 : true",
            "test : 1, 1, 1 : false",
            "test : 1, 2 : false",
            "test : 1 : false",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Array123.array123(param);

        assertEquals(expected, result);
    }
}