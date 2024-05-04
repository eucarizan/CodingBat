import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class StringMatchTest {
    @ParameterizedTest(name = "{0} -- method({1}, {2}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : xxcaazz : xxbaaz : 3",
            "test2 : abc : abc : 2",
            "test3 : abc : axc : 0",
            "test4 : hello : he : 1",
            "test5 : he : hello : 1",
            "test6 : h : hello : 0",
            "test7 : '' : hello : 0",
            "test8 : aabbccdd : abbbxxd : 1",
            "test9 : aaxxaaxx : iaxxai : 3",
            "test10 : iaxxai : aaxxaaxx : 3",
    }, delimiter = ':')
    public void test(String name, String a, String b, int expected) {
        var result = StringMatch.stringMatch(a, b);

        assertEquals(expected, result);
    }
}