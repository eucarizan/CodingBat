import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class NonStartTest {
    @ParameterizedTest(name = "{0} -- method({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : There : ellohere",
            "test2 : java : code : avaode",
            "test3 : shotl : java : hotlava",
            "test4 : ab : xy : by",
            "test5 : ab : x : b",
            "test6 : x : ac : c",
            "test7 : a : x : ''",
            "test8 : kit : kat : itat",
            "test9 : mart : dart : artart",
    }, delimiter = ':')
    public void test(String name, String a, String b, String expected) {
        var result = NonStart.nonStart(a, b);

        assertEquals(expected, result);
    }
}