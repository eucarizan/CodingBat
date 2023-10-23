import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class EveryNthTest {
    @ParameterizedTest(name = "{0} -- method({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Miracle : 2 : Mrce",
            "test2 : abcdefg : 2 : aceg",
            "test3 : abcdefg : 3 : adg",
            "test4 : Chocolate : 3 : Cca",
            "test5 : Chocolates : 3 : Ccas",
            "test6 : Chocolates : 4 : Coe",
            "test7 : Chocolates : 100 : C",
    }, delimiter = ':')
    public void test(String name, String param, int n, String expected) {
        var result = EveryNth.everyNth(param, n);

        assertEquals(expected, result);
    }
}