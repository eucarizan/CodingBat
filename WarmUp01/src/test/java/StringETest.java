import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class StringETest {
    @ParameterizedTest(name = "{0} -- stringE({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : true",
            "test2 : Heelle : true",
            "test3 : Heelele : false",
            "test4 : Hll : false",
            "test5 : e : true",
            "test6 : '' : false",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {
        var result = StringE.stringE(param);

        assertEquals(expected, result);
    }

}