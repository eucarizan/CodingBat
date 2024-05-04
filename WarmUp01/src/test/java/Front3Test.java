import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Front3Test {
    @ParameterizedTest(name = "{0} -- front3({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Java : JavJavJav",
            "test2 : Chocolate : ChoChoCho",
            "test3 : abc : abcabcabc",
            "test4 : abcXYZ : abcabcabc",
            "test5 : ab : ababab",
            "test6 : a : aaa",
            "test7 : '' : ''",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        String result = Front3.front3(param);

        assertEquals(expected, result);
    }

}