import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class MiddleTwoTest {
    @ParameterizedTest(name = "{0} -- middleTwo({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : string : ri",
            "test2 : code : od",
            "test3 : Practice : ct",
            "test4 : ab : ab",
            "test5 : 0123456789 : 45",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = MiddleTwo.middleTwo(param);

        assertEquals(expected, result);
    }
}