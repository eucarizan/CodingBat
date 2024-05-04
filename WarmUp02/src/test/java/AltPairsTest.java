import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class AltPairsTest {
    @ParameterizedTest(name = "{0} -- altPairs({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : kitten : kien",
            "test2 : Chocolate : Chole",
            "test3 : CodingHorror : Congrr",
            "test4 : yak : ya",
            "test5 : ya : ya",
            "test6 : y : y",
            "test7 : '' : ''",
            "test8 : ThisThatTheOther : ThThThth",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = AltPairs.altPairs(param);

        assertEquals(expected, result);
    }
}