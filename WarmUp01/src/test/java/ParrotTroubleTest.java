import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParrotTroubleTest {
    @ParameterizedTest(name = "{0} -- isInTrouble({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : true : 6 : true",
            "test2 : true : 7 : false",
            "test3 : false : 6 : false",
            "test4 : true : 21 : true",
            "test5 : false : 21 : false",
            "test6 : false : 20 : false",
            "test7 : true : 23 : true",
            "test8 : false : 23 : false",
            "test9 : true : 20 : false",
            "test10 : false : 12 : false",
    }, delimiter = ':')
    public void test(String name, boolean talking, int hour, boolean expected) {
        boolean result = ParrotTrouble.isInTrouble(talking, hour);

        assertEquals(expected, result);
    }

}