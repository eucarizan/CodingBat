import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class DoubleXTest {
    @ParameterizedTest(name = "{0} -- doubleX({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : axxbb : true",
            "test2 : axaxax : false",
            "test3 : xxxxx : true",
            "test4 : xaxxx : false",
            "test5 : aaaax : false",
            "test6 : '' : false",
            "test7 : abc : false",
            "test8 : x : false",
            "test9 : xx : true",
            "test10 : xax : false",
            "test11 : xaxx : false",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {
        var result = DoubleX.doubleX(param);

        assertEquals(expected, result);
    }
}