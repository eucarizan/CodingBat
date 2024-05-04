import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class LoneTeenTest {
    @ParameterizedTest(name = "{0} -- loneTeen({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1: 13 : 99 : true",
            "test2 : 21 : 19 : true",
            "test3 : 13 : 13 : false",
            "test4 : 14 : 20 : true",
            "test5 : 20 : 15 : true",
            "test6 : 16 : 17 : false",
            "test7 : 16 : 9 : true",
            "test8 : 16 : 18 : false",
            "test9 : 13 : 19 : false",
            "test11 : 13 : 20 : true",
            "test12 : 6 : 18 : true",
            "test13 : 99 : 13 : true",
            "test14 : 99 : 99 : false",
    }, delimiter = ':')
    public void test(String name, int a, int b, boolean expected) {
        boolean result = LoneTeen.loneTeen(a, b);

        assertEquals(expected, result);
    }

}