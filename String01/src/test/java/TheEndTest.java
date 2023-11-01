import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class TheEndTest {
    @ParameterizedTest(name = "{0} -- theEnd({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : true : H",
            "test2 : Hello : false : o",
            "test3 : oh : true : o",
            "test4 : oh : false : h",
            "test5 : x : true : x",
            "test6 : x : false : x",
            "test7 : java : true : j",
            "test8 : chocolate : false : e",
            "test9 : 1234 : true : 1",
            "test10 : code : false : e",
    }, delimiter = ':')
    public void test(String name, String param, boolean front, String expected) {
        var result = TheEnd.theEnd(param, front);

        assertEquals(expected, result);
    }
}