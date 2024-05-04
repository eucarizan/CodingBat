import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class SeeColorTest {
    @ParameterizedTest(name = "{0} -- seeColor({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : redxx : red",
            "test2 : xxred : ''",
            "test3 : blueTimes : blue",
            "test4 : NoColor : ''",
            "test5 : red : red",
            "test6 : re : ''",
            "test7 : blu : ''",
            "test8 : blue : blue",
            "test9 : a : ''",
            "test10 : '' : ''",
            "test12 : xyzred : ''",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = SeeColor.seeColor(param);

        assertEquals(expected, result);
    }
}