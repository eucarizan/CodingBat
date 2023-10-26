import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class StringBitsTest {
    @ParameterizedTest(name = "{0} -- stringBits({1}, {2}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : Hlo",
            "test2 : Hi : H",
            "test3 : Heeololeo : Hello",
            "test4 : HiHiHi : HHH",
            "test5 : '' : ''",
            "test6 : Greetings : Getns",
            "test7 : Chocoate : Coot",
            "test8 : pi : p",
            "test9 : Hello Kitten : HloKte",
            "test10 : hxaxpxpxy : happy",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = StringBits.stringBits(param);

        assertEquals(expected, result);
    }
}