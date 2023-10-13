import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Front22Test {
    @ParameterizedTest(name = "{0} -- front22({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : kitten : kikittenki",
            "test2 : Ha : HaHaHa",
            "test3 : abc : ababcab",
            "test4 : ab : ababab",
            "test5 : a : aaa",
            "test6 : '' : '' ",
            "test7 : Logic : LoLogicLo",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        String result = Front22.front22(param);

        assertEquals(expected, result);
    }

}