import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class StartWordTest {
    @ParameterizedTest(name = "{0} -- startWord({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : hippo : hi : hi",
            "test2 : hippo : xip : hip",
            "test3 : hippo : i : h",
            "test4 : hippo : ix : ''",
            "test5 : h : ix : ''",
            "test6 : '' : i : ''",
            "test7 : hip : zi : hi",
            "test8 : hip : zip : hip",
            "test9 : hip : zig : ''",
            "test10 : h : z : h",
            "test11 : hippo : xippo : hippo",
            "test12 : hippo : xyz : ''",
            "test13 : hippo : hip : hip",
            "test14 : kitten : cit : kit",
            "test15 : kit : cit : kit",
    }, delimiter = ':')
    public void test(String name, String param, String input, String expected) {
        var result = StartWord.startWord(param, input);

        assertEquals(expected, result);
    }
}