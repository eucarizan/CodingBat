import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class LastCharsTest {
    @ParameterizedTest(name = "{0} -- lastChars({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : last : chars : ls",
            "test2 : yo : java : ya",
            "test3 : hi : '' : h@",
            "test4 : '' : hello : @o",
            "test5 : '' : '' : @@",
            "test6 : kitten : hi : ki",
            "test7 : k : zip : kp",
            "test8 : kitten : '' : k@",
            "test9 : kitten : zip : kp",
    }, delimiter = ':')
    public void test(String name, String a, String b, String expected) {
        var result = LastChars.lastChars(a, b);

        assertEquals(expected, result);
    }
}