import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Close10Test {
    @ParameterizedTest(name = "{0} -- close10({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test : 8 : 13 : 8",
            "test : 13 : 8 : 8",
            "test : 13 : 7 : 0",
            "test : 7 : 13 : 0",
            "test : 9 : 13 : 9",
            "test : 13 : 8 : 8",
            "test : 10 : 12 : 10",
            "test : 11 : 10 : 10",
            "test : 5 : 21 : 5",
            "test : 0 : 20 : 0",
            "test : 10 : 10 : 0",
    }, delimiter = ':')
    public void test(String name, int a, int b, int expected) {
        var result = Close10.close10(a, b);

        assertEquals(expected, result);
    }

}