import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class NTwiceTest {
    @ParameterizedTest(name = "{0} -- nTwice({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : 2 : Helo",
            "test2 : Chocolate : 3 : Choate",
            "test3 : Chocolate : 1 : Ce",
            "test4 : Chocolate : 0 : ''",
            "test5 : Hello : 4 : Hellello",
            "test6 : Code : 4 : CodeCode",
            "test7 : Code : 2 : Code",
    }, delimiter = ':')
    public void test(String name, String param, int n, String expected) {
        var result = NTwice.nTwice(param, n);

        assertEquals(expected, result);
    }
}