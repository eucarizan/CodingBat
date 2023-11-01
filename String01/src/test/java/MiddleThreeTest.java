import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class MiddleThreeTest {
    @ParameterizedTest(name = "{0} -- middleThree({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Candy : and",
            "test2 : and : and",
            "test3 : solving : lvi",
            "test4 : Hi yet Hi : yet",
            "test5 : java yet java : yet",
            "test6 : Chocolate : col",
            "test7 : XabcxyzabcX : xyz",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = MiddleThree.middleThree(param);

        assertEquals(expected, result);
    }
}