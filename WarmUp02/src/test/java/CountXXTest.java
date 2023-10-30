import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class CountXXTest {
    @ParameterizedTest(name = "{0} -- countXX({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : abcxx : 1",
            "test2 : xxx : 2",
            "test3 : xxxx : 3",
            "test4 : abc : 0",
            "test5 : Hello there : 0",
            "test6 : Hexxo thxxe : 2",
            "test7 : '' : 0",
            "test8 : Kittens : 0",
            "test9 : Kittensxxx : 2",
    }, delimiter = ':')
    public void test(String name, String param, int expected) {
        var result = CountXX.countXX(param);

        assertEquals(expected, result);
    }
}