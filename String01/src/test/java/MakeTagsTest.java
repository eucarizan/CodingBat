import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class MakeTagsTest {
    @ParameterizedTest(name = "{0} -- method({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : i : Yay : <i>Yay</i>",
            "test2 : i : Hello : <i>Hello</i>",
            "test3 : cite : Yay : <cite>Yay</cite>",
            "test4 : address : here : <address>here</address>",
            "test5 : body : Heart : <body>Heart</body>",
            "test6 : i : i : <i>i</i>",
            "test7 : i : '' : <i></i>",
    }, delimiter = ':')
    public void test(String name, String tag, String word, String expected) {
        var result = MakeTags.makeTags(tag, word);

        assertEquals(expected, result);
    }
}