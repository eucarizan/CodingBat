import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class CigarPartyTest {
    @ParameterizedTest(name = "{0} -- cigarParty({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 30 : false : false",
            "test2 : 50 : false : true",
            "test3 : 70 : true : true",
            "test4 : 30 : true : false",
            "test5 : 50 : true : true",
            "test6 : 60 : false : true",
            "test7 : 61 : false : false",
            "test8 : 40 : false : true",
            "test9 : 39 : false : false",
            "test10 : 40 : true : true",
            "test11 : 39 : true : false",
    }, delimiter = ':')
    public void test(String name, int cigars, boolean isWeekend, boolean expected) {
        var result = CigarParty.cigarParty(cigars, isWeekend); // .toString()

        assertEquals(expected, result);
    }
}