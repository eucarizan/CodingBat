import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class WithoutEndTest {
    @ParameterizedTest(name = "{0} -- withoutEnd({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : ell",
            "test2 : java : av",
            "test3 : coding : odin",
            "test4 : code : od",
            "test5 : ab : ''",
            "test6 : Chocolate! : hocolate",
            "test7 : kitten : itte",
            "test8 : woohoo : ooho",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = WithoutEnd.withoutEnd(param);

        assertEquals(expected, result);
    }
}