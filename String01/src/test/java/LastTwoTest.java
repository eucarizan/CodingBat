import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class LastTwoTest {
    @ParameterizedTest(name = "{0} -- lastTwo({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : coding : codign",
            "test2 : cat : cta",
            "test3 : ab : ba",
            "test4 : a : a",
            "test5 : '' : ''",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = LastTwo.lastTwo(param);

        assertEquals(expected, result);
    }
}