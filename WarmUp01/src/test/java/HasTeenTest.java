import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class HasTeenTest {
    @ParameterizedTest(name = "{0} -- hasTeen({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 13 : 20 : 10 : true",
            "test2 : 20 : 19 : 10 : true",
            "test3 : 20 : 10 : 13 : true",
            "test4 : 1 : 20 : 12 : false",
            "test5 : 19 : 20 : 12 : true",
            "test6 : 12 : 20 : 19 : true",
            "test7 : 12 : 9 : 20 : false",
            "test8 : 12 : 18 : 20 : true",
            "test9 : 14 : 2 : 20 : true",
            "test10 : 4 : 2 : 20 : false",
            "test11 : 11 : 22 : 22 : false",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, boolean expected) {
        boolean result = HasTeen.hasTeen(a, b, c);

        assertEquals(expected, result);
    }

}