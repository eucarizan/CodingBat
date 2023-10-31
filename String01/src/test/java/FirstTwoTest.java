import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class FirstTwoTest {
    @ParameterizedTest(name = "{0} -- firstTwo({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : He",
            "test2 : abcdefg : ab",
            "test3 : ab : ab",
            "test4 : a : a",
            "test5 : '' : ''",
            "test6 : Kitten : Ki",
            "test7 : hi : hi",
            "test8 : hiya : hi",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = FirstTwo.firstTwo(param);

        assertEquals(expected, result);
    }
}