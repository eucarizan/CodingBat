import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Max1020Test {
    @ParameterizedTest(name = "{0} -- max1020({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 11 : 19 : 19 ",
            "test2 : 19 : 11 : 19 ",
            "test3 : 11 : 9 : 11 ",
            "test4 : 9 : 21 : 0 ",
            "test5 : 10 : 21 : 10 ",
            "test6 : 21 : 10 : 10 ",
            "test7 : 9 : 11 : 11 ",
            "test8 : 23 : 10 : 10 ",
            "test9 : 20 : 10 : 20 ",
            "test10 : 7 : 20 : 20 ",
            "test11 : 17 : 16 : 17 ",
    }, delimiter = ':')
    public void test(String name, int a, int b, int expected) {
        var result = Max1020.max1020(a, b);

        assertEquals(expected, result);
    }

}