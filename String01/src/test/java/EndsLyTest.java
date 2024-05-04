import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class EndsLyTest {
    @ParameterizedTest(name = "{0} -- endsLy({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : oddly : true",
            "test2 : y : false",
            "test3 : oddy : false",
            "test4 : oddl : false",
            "test5 : olydd : false",
            "test6 : ly : true",
            "test7 : '' : false",
            "test8 : falsey : false",
            "test9 : evenly : true",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {
        var result = EndsLy.endsLy(param);

        assertEquals(expected, result);
    }
}