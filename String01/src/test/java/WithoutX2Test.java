import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class WithoutX2Test {
    @ParameterizedTest(name = "{0} -- withoutX2({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : xHi : Hi",
            "test2 : Hxi : Hi",
            "test3 : Hi : Hi",
            "test4 : xxHi : Hi",
            "test5 : Hix : Hix",
            "test6 : xaxb : axb",
            "test7 : xx : ''",
            "test8 : x : ''",
            "test9 : '' : ''",
            "test10 : Hello : Hello",
            "test11 : Hexllo : Hexllo",
            "test12 : xHxllo : Hxllo",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = WithoutX2.withoutX2(param);

        assertEquals(expected, result);
    }
}