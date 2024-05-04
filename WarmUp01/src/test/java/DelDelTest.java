import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class DelDelTest {
    @ParameterizedTest(name = "{0} -- delDel({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : adelbc : abc",
            "test2 : adelHello : aHello",
            "test3 : adedbc : adedbc",
            "test4 : abcdel : abcdel",
            "test5 : add : add",
            "test6 : ad : ad",
            "test7 : a : a",
            "test8 : '' : ''",
            "test9 : del : del",
            "test10 : adel : a",
            "test11 : aadelbb : aadelbb",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        String result = DelDel.delDel(param);

        assertEquals(expected, result);
    }

}