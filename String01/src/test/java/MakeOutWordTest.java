import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class MakeOutWordTest {
    @ParameterizedTest(name = "{0} -- makeOutWord({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : <<>> : Yay : <<Yay>>",
            "test2 : <<>> : WooHoo : <<WooHoo>>",
            "test3 : [[]] : word : [[word]]",
            "test4 : HHoo : Hello : HHHellooo",
            "test5 : abyz : YAY : abYAYyz",
    }, delimiter = ':')
    public void test(String name, String a, String b, String expected) {
        var result = MakeOutWord.makeOutWord(a, b);

        assertEquals(expected, result);
    }
}