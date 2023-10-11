import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MissingCharTest {
    @ParameterizedTest(name = "{0} -- missingChar({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : kitten : 1 : ktten",
            "test2 : kitten : 0 : itten",
            "test3 : kitten : 4 : kittn",
            "test4 : Hi : 0 : i",
            "test5 : Hi : 1 : H",
            "test6 : code : 0 : ode",
            "test7 : code : 1 : cde",
            "test8 : code : 2 : coe",
            "test9 : code : 3 : cod",
            "test10 : chocolate : 8 : chocolat",
    }, delimiter = ':')
    public void test(String name, String str, int n, String expected) {
        String result = MissingChar.missingChar(str, n);

        assertEquals(expected, result);
    }

}