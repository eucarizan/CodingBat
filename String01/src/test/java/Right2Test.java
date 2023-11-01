import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class Right2Test {
    @ParameterizedTest(name = "{0} -- right2({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : loHel",
            "test2 : java : vaja",
            "test3 : Hi : Hi",
            "test4 : code : deco",
            "test5 : cat : atc",
            "test6 : 12345 : 45123",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = Right2.right2(param);

        assertEquals(expected, result);
    }
}