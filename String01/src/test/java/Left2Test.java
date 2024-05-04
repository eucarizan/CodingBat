import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class Left2Test {
    @ParameterizedTest(name = "{0} -- left2({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : lloHe",
            "test2 : java : vaja",
            "test3 : Hi : Hi",
            "test4 : code : deco",
            "test5 : cat : tca",
            "test6 : 12345 : 34512",
            "test7 : Chocolate : ocolateCh",
            "test8 : bricks : icksbr",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        var result = Left2.left2(input);

        assertEquals(expected, result);
    }
}