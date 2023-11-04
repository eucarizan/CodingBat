import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class ExtraFrontTest {
    @ParameterizedTest(name = "{0} -- extraFront({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : HeHeHe",
            "test2 : ab : ababab",
            "test3 : H : HHH",
            "test4 : '' : ''",
            "test5 : Candy : CaCaCa",
            "test6 : Code : CoCoCo",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = ExtraFront.extraFront(param);

        assertEquals(expected, result);
    }
}