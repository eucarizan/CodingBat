import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Last2Test {
    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : hixxhi : 1",
            "test2 : xaxxaxaxx : 1",
            "test3 : axxxaaxx : 2",
            "test4 : xxaxxaxxaxx : 3",
            "test5 : xaxaxaxx : 0",
            "test6 : xxxx : 2",
            "test7 : 13121312 : 1",
            "test8 : 11212 : 1",
            "test9 : 13121311 : 0",
            "test10 : 1717171 : 2",
            "test11 : hi : 0",
            "test12 : h : 0",
            "test13 : '' : 0",
    }, delimiter = ':')
    public void test(String name, String param, int expected) {
        var result = Last2.last2(param);

        assertEquals(expected, result);
    }
}