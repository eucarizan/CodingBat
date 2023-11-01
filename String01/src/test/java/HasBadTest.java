import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class HasBadTest {
    @ParameterizedTest(name = "{0} -- hasBad({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : badxx : true",
            "test2 : xbadxx : true",
            "test3 : xxbadxx : false",
            "test4 : code : false",
            "test5 : bad : true",
            "test6 : ba : false",
            "test7 : xba : false",
            "test8 : xbad : true",
            "test9 : '' : false",
            "test10 : badyy : true",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {
        var result = HasBad.hasBad(param);

        assertEquals(expected, result);
    }
}