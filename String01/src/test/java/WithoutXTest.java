import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class WithoutXTest {
    @ParameterizedTest(name = "{0} -- withoutX({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : xHix : Hi",
            "test2 : xHi : Hi",
            "test3 : Hxix : Hxi",
            "test4 : Hi : Hi",
            "test5 : xxHi : xHi",
            "test6 : Hix : Hi",
            "test7 : xaxbx : axb",
            "test8 : xx : ''",
            "test9 : x : ''",
            "test10 : '' : ''",
            "test11 : Hello : Hello",
            "test12 : Hexllo : Hexllo",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = WithoutX.withoutX(param);

        assertEquals(expected, result);
    }
}