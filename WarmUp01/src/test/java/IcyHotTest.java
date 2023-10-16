import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class IcyHotTest {
    @ParameterizedTest(name = "{0} -- notString({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 120 : -1 : true",
            "test2 : -1 : 120 : true",
            "test3 : 2 : 120 : false",
            "test4 : -1 : 100 : false",
            "test5 : -2 : -2 : false",
            "test6 : 120 : 120 : false",
    }, delimiter = ':')
    public void test(String name, int temp1, int temp2, boolean expected) {
        boolean result = IcyHot.icyHot(temp1, temp2);

        assertEquals(expected, result);
    }

}