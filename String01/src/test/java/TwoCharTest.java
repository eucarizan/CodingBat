import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class TwoCharTest {
    @ParameterizedTest(name = "{0} -- twoChar({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : java : 0 : ja",
            "test2 : java : 2 : va",
            "test3 : java : 3 : ja",
            "test4 : java : 4 : ja",
            "test5 : java : -1 : ja",
            "test6 : Hello : 0 : He",
            "test7 : Hello : 1 : el",
            "test8 : Hello : 99 : He",
            "test9 : Hello : 3 : lo",
            "test10 : Hello : 4 : He",
            "test11 : Hello : 5 : He",
            "test12 : Hello : -7 : He",
            "test13 : Hello : 6 : He",
            "test14 : Hello : -1 : He",
            "test15 : yay : 0 : ya",
    }, delimiter = ':')
    public void test(String name, String param, int n, String expected) {
        var result = TwoChar.twoChar(param, n);

        assertEquals(expected, result);
    }
}