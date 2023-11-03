import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class ConCatTest {
    @ParameterizedTest(name = "{0} -- conCat({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : abc : cat : abcat",
            "test2 : dog : cat : dogcat",
            "test3 : abc : '' : abc",
            "test4 : '' : cat : cat",
            "test5 : pig : g : pig",
            "test6 : pig : doggy : pigdoggy",
    }, delimiter = ':')
    public void test(String name, String a, String b, String expected) {
        var result = ConCat.conCat(a, b);

        assertEquals(expected, result);
    }
}