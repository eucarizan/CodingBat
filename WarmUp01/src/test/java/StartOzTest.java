import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class StartOzTest {
    @ParameterizedTest(name = "{0} -- startOz({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : ozymandias : oz",
            "test2 : bzoo : z",
            "test3 : oxx : o",
            "test4 : oz : oz",
            "test5 : ounce : o",
            "test6 : o : o",
            "test7 : abc : ''",
            "test8 : '' : ''",
            "test9 : zoo : ''",
            "test10 : aztec : z",
            "test11 : zzzz : z",
            "test12 : oznic : oz",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        String result = StartOz.startOz(param);

        assertEquals(expected, result);
    }

}