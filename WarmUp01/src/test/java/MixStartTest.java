import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MixStartTest {
    @ParameterizedTest(name = "{0} -- mixStart({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : mix snacks : true",
            "test2 : pix snacks : true",
            "test3 : piz snacks : false",
            "test4 : nix : true",
            "test5 : ni : false",
            "test6 : n : false",
            "test7 : '' : false",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {
        boolean result = MixStart.mixStart(param);

        assertEquals(expected, result);
    }

}