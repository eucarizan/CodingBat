import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class In1020Test {
    @ParameterizedTest(name = "{0} -- in1020({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 12 : 99 : true",
            "test2 : 21 : 12 : true",
            "test3 : 8 : 99 : false",
            "test4 : 99 : 10 : true",
            "test5 : 20 : 20 : true",
            "test6 : 21 : 21 : false",
            "test7 : 9 : 9 : false",
    }, delimiter = ':')
    public void test(String name, int a, int b, boolean expected) {
        boolean result = In1020.in1020(a, b);

        assertEquals(expected, result);
    }

}