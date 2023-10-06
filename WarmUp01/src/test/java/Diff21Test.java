import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Diff21Test {
    @ParameterizedTest(name = "{0} -- diff21({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 19 : 2",
            "test2 : 10 : 11",
            "test3 : 21 : 0",
            "test4 : 22 : 2",
            "test5 : 25 : 8",
            "test6 : 30 : 18",
            "test7 : 0 : 21",
            "test8 : 1 : 20",
            "test9 : 2 : 19",
            "test10 : -1 : 22",
            "test11 : -2 : 23",
            "test12 : 50 : 58",
    }, delimiter = ':')
    public void test(String name, int n, int expected) {
        int result = Diff21.diff21(n);

        assertEquals(expected, result);
    }
}