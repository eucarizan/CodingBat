import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class ComboStringTest {
    @ParameterizedTest(name = "{0} -- comboString({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : hi : hiHellohi",
            "test2 : hi : Hello : hiHellohi",
            "test3 : aaa : b : baaab",
            "test4 : b : aaa : baaab",
            "test5 : aaa : '' : aaa",
            "test6 : '' : bb : bb",
            "test7 : aaa : 1234 : aaa1234aaa",
            "test8 : aaa : bb : bbaaabb",
            "test9 : a : bb : abba",
            "test10 : bb : a : abba",
            "test11 : xyz : ab : abxyzab",
    }, delimiter = ':')
    public void test(String name, String a, String b, String expected) {
        var result = ComboString.comboString(a, b);

        assertEquals(expected, result);
    }
}