import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class FrontAgainTest {
    @ParameterizedTest(name = "{0} -- frontAgain({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : edited : true",
            "test2 : edit : false",
            "test3 : ed : true",
            "test4 : jj : true",
            "test5 : jjj : true",
            "test6 : jjjj : true",
            "test7 : jjjk : false",
            "test8 : x : false",
            "test9 : '' : false",
            "test10 : java : false",
            "test 111: javaja : true",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {

        var result = FrontAgain.frontAgain(param);

        assertEquals(expected, result);
    }
}