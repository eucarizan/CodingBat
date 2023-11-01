import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class WithoutEnd2Test {
    @ParameterizedTest(name = "{0} -- withoutEnd2({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : ell",
            "test2 : abc : b",
            "test3 : ab : ''",
            "test4 : a : ''",
            "test5 : '' : ''",
            "test6 : coldy : old",
            "test7 : java code : ava cod",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = WithoutEnd2.withoutEnd2(param);

        assertEquals(expected, result);
    }
}