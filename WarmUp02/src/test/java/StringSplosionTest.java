import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class StringSplosionTest {
    @ParameterizedTest(name = "{0} -- stringSplosion({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Code : CCoCodCode",
            "test2 : abc : aababc",
            "test3 : ab : aab",
            "test4 : x : x",
            "test5 : fade : ffafadfade",
            "test6 : There : TThTheTherThere",
            "test7 : Kitten : KKiKitKittKitteKitten",
            "test8 : Bye : BByBye",
            "test9 : Good : GGoGooGood",
            "test10 : Bad : BBaBad",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = StringSplosion.stringSplosion(param);

        assertEquals(expected, result);
    }
}