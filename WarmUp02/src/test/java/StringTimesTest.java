import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class StringTimesTest {
    @ParameterizedTest(name = "{0} -- stringTimes({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hi : 2 : HiHi",
            "test2 : Hi : 3 : HiHiHi",
            "test3 : Hi : 1 : Hi",
            "test4 : Hi : 0 : ''",
            "test5 : Hi : 5 : HiHiHiHiHi",
            "test6 : Oh Boy! : 2 : Oh Boy!Oh Boy!",
            "test7 : x : 4 : xxxx",
            "test8 : '' : 4 : ''",
            "test9 : code : 2 : codecode",
            "test10 : code : 3 : codecodecode",
    }, delimiter = ':')
    public void test(String name, String param, int n, String expected) {
        var result = StringTimes.stringTimes(param, n);

        assertEquals(expected, result);
    }
}