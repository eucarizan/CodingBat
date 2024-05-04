import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Makes10Test {
    @ParameterizedTest(name = "{0} -- tenOrSumIs10({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 9 : 10 : true",
            "test2 : 9 : 9 : false",
            "test3 : 1 : 9 : true",
            "test4 : 10 : 1 : true",
            "test5 : 10 : 10 : true",
            "test6 : 8 : 2 : true",
            "test7 : 8 : 3 : false",
            "test8 : 10 : 42 : true",
            "test9 : 12 : -2 : true",
    }, delimiter = ':')
    public void test(String name, int a, int b, boolean expected) {
        boolean result = Makes10.tenOrSumIs10(a, b);

        assertEquals(expected, result);
    }
}