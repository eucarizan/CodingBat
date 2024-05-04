import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class AtFirstTest {
    @ParameterizedTest(name = "{0} -- atFirst({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : hello : he",
            "test2 : hi : hi",
            "test3 : h : h@",
            "test4 : '' : @@",
            "test5 : kitten : ki",
            "test6 : java : ja",
            "test7 : j : j@",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = AtFirst.atFirst(param);

        assertEquals(expected, result);
    }
}