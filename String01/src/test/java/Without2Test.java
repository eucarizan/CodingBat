import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class Without2Test {
    @ParameterizedTest(name = "{0} -- without2({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : HelloHe : lloHe",
            "test2 : HelloHi : HelloHi",
            "test3 : Hi : ''",
            "test4 : Chocolate : Chocolate",
            "test5 : xxx : x",
            "test6 : xx : ''",
            "test7 : x : x",
            "test8 : '' : ''",
            "test9 : Fruits : Fruits",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = Without2.without2(param);

        assertEquals(expected, result);
    }
}