import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")

class Or35Test {
    @ParameterizedTest(name = "{0} -- or35({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 123 : true",
            "test2 : 3 : true",
            "test3 : 10 : true",
            "test4 : 8 : false",
            "test5 : 15 : true",
            "test6 : 5 : true",
            "test7 : 9 : true",
            "test8 : 4 : false",
            "test9 : 7 : false",
            "test10 : 6 : true",
            "test11 : 17 : false",
            "test12 : 18 : true",
            "test13 : 29 : false",
            "test14 : 20 : true",
            "test15 : 21 : true",
            "test16 : 22 : false",
            "test17 : 45 : true",
            "test18 : 99 : true",
            "test19 : 100 : true",
            "test20 : 101 : false",
            "test21 : 121 : false",
            "test22 : 122 : false",
    }, delimiter = ':')
    public void test(String name, int param, boolean expected) {
        boolean result = Or35.or35(param);

        assertEquals(expected, result);
    }
}