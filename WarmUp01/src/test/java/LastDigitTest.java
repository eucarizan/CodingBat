import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class LastDigitTest {
    @ParameterizedTest(name = "{0} -- method({1}, {2}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 7 : 17 : true",
            "test2 : 6 : 17 : false",
            "test3 : 3 : 113 : true",
            "test4 : 114 : 113 : false",
            "test5 : 114 : 4 : true",
            "test6 : 10 : 0 : true",
            "test7 : 11 : 0 : false",
    }, delimiter = ':')
    public void test(String name, int a, int b, boolean expected) {
        var result = LastDigit.lastDigit(a, b);

        assertEquals(expected, result);
    }
}