import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class In3050Test {
    @ParameterizedTest(name = "{0} -- in3050({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 30 : 31 : true",
            "test2 : 30 : 41 : false",
            "test3 : 40 : 50 : true",
            "test4 : 40 : 51 : false",
            "test5 : 39 : 50 : false",
            "test6 : 50 : 39 : false",
            "test7 : 40 : 39 : true",
            "test8 : 49 : 48 : true",
            "test9 : 50 : 40 : true",
            "test10 : 50 : 51 : false",
            "test11 : 35 : 36 : true",
            "test12 : 35 : 45 : false",
    }, delimiter = ':')
    public void test(String name, int a, int b, boolean expected) {
        var result = In3050.in3050(a, b);

        assertEquals(expected, result);
    }

}