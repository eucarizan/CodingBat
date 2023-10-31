import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class FirstHalfTest {
    @ParameterizedTest(name = "{0} -- firstHalf({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : WooHoo : Woo",
            "test2 : HelloThere : Hello",
            "test3 : abcdef : abc",
            "test4 : ab : a",
            "test5 : '' : ''",
            "test6 : 0123456789 : 01234",
            "test7 : kitten : kit",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = FirstHalf.firstHalf(param);

        assertEquals(expected, result);
    }
}