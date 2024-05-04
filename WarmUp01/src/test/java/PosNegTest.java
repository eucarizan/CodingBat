import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class PosNegTest {
    @ParameterizedTest(name = "{0} -- posNeg({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1 : -1 : false : true",
            "test2 : -1 : 1 : false : true",
            "test3 : -4 : -5 : true : true",
            "test4 : -4 : -5 : false : false",
            "test5 : -4 : 5 : false : true",
            "test6 : -4 : 5 : true : false",
            "test7 : 1 : 1 : false : false",
            "test8 : -1 : -1 : false : false",
            "test9 : 1 : -1 : true : false",
            "test10 : -1 : 1 : true : false",
            "test11 : 1 : 1 : true : false",
            "test12 : -1 : -1 : true : true",
            "test13 : 5 : -5 : false : true",
            "test14 : -6 : 6 : false : true",
            "test15 : -5 : -6 : false : false",
            "test16 : -2 : -1 : false : false",
            "test17 : 1 : 2 : false : false",
            "test18 : -5 : 6: true : false",
            "test19 : -5 : -5 : true : true",
    }, delimiter = ':')
    public void test(String name, int a, int b, boolean negative, boolean expected) {
        boolean result = PosNeg.posNeg(a, b, negative);

        assertEquals(expected, result);
    }
}