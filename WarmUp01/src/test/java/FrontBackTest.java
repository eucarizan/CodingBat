import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class FrontBackTest {
    @ParameterizedTest(name = "{0} -- frontBack({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : code : eodc",
            "test2 : a : a",
            "test3 : ab : ba",
            "test4 : abc : cba",
            "test5 : '' : ''",
            "test6 : Chocolate : ehocolatC",
            "test7 : aavJ : Java",
            "test8 : hello : oellh",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        String result = FrontBack.frontBack(param);

        assertEquals(expected, result);
    }
}