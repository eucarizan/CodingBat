import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class StringXTest {
    @ParameterizedTest(name = "{0} -- stringX({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : xxHxix : xHix",
            "test2 : abxxxcd : abcd",
            "test3 : xabxxxcdx : xabcdx",
            "test4 : xKittenx : xKittenx",
            "test5 : Hello : Hello",
            "test6 : xx : xx",
            "test7 : x : x",
            "test8 : '' : ''",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = StringX.stringX(param);

        assertEquals(expected, result);
    }
}