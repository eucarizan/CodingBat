import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class ExtraEndTest {
    @ParameterizedTest(name = "{0} -- extraEnd({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : lololo",
            "test2 : ab : ababab",
            "test3 : Hi : HiHiHi",
            "test4 : Candy : dydydy",
            "test5 : Code : dedede",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = ExtraEnd.extraEnd(param);

        assertEquals(expected, result);
    }
}