import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class DeFrontTest {
    @ParameterizedTest(name = "{0} -- deFront({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : llo",
            "test2 : java : va",
            "test3 : away : aay",
            "test4 : axy : ay",
            "test5 : abc : abc",
            "test6 : xby : by",
            "test7 : ab : ab",
            "test8 : ax : a",
            "test9 : axb : ab",
            "test10 : aaa : aa",
            "test11 : xbc : bc",
            "test12 : bbb : bb",
            "test13 : bazz : zz",
            "test14 : ba : ''",
            "test15 : abxyz : abxyz",
            "test16 : hi : ''",
            "test17 : his : s",
            "test18 : xz : ''",
            "test19 : zzz : z",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = DeFront.deFront(param);

        assertEquals(expected, result);
    }
}