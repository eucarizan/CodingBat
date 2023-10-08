import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class NearHundredTest {
    @ParameterizedTest(name = "{0} -- isNearHundred({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 93 : true",
            "test2 : 90 : true",
            "test3 : 89 : false",
            "test4 : 110 : true",
            "test5 : 111 : false",
            "test6 : 121 : false",
            "test7 : -101 : false",
            "test8 : -209 : false",
            "test9 : 190 : true",
            "test10 : 209 : true",
            "test11 : 0 : false",
            "test12 : 5 : false",
            "test13 : -50 : false",
            "test14 : 191 : true",
            "test15 : 189 : false",
            "test16 : 200 : true",
            "test17 : 210 : true",
            "test18 : 211 : false",
            "test19 : 290 : false",
    }, delimiter = ':')
    public void test(String name, int n, boolean expected) {
        boolean result = NearHundred.isNearHundred(n);

        assertEquals(expected, result);
    }
}