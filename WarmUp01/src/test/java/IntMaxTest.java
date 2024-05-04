import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class IntMaxTest {
    @ParameterizedTest(name = "{0} -- intMax({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1 : 2 : 3 : 3",
            "test2 : 1 : 3 : 2 : 3",
            "test3 : 3 : 2 : 1 : 3",
            "test4 : 9 : 3 : 3 : 9",
            "test5 : 3 : 9 : 3 : 9",
            "test6 : 3 : 3 : 9 : 9",
            "test7 : 8 : 2 : 3 : 8",
            "test8 : -3 : -1 : -2 : -1",
            "test9 : 6 : 2 : 5 : 6",
            "test10 : 5 : 6 : 2 : 6",
            "test11 : 5 : 2 : 6 : 6",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, int expected) {
        var result = IntMax.intMax(a, b, c);

        assertEquals(expected, result);
    }

}