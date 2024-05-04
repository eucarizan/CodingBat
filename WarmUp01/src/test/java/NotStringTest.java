import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class NotStringTest {
    @ParameterizedTest(name = "{0} -- notString({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : candy : not candy",
            "test2 : x : not x",
            "test3 : not bad : not bad",
            "test4 : bad : not bad",
            "test5 : not : not",
            "test6 : is not : not is not",
            "test7 : no : not no",
    }, delimiter = ':')
    public void test(String name, String str, String expected) {
        String result = NotString.notString(str);

        assertEquals(expected, result);
    }
}