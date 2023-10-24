import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class FrontTimesTest {
    @ParameterizedTest(name = "{0} -- method({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Chocolate : 2 : ChoCho",
            "test2 : Chocolate : 3 : ChoChoCho",
            "test3 : Abc : 3 : AbcAbcAbc",
            "test4 : Ab : 4 : AbAbAbAb",
            "test5 : A : 4 : AAAA",
            "test6 : '' : 4 : ''",
            "test7 : Abc : 0 : ''",
    }, delimiter = ':')
    public void test(String name, String param, int n, String expected) {
        var result = FrontTimes.frontTimes(param, n);

        assertEquals(expected, result);
    }
}