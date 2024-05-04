import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class StringYakTest {
    @ParameterizedTest(name = "{0} -- stringYak({1}, {2}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : yakpak : pak",
            "test2 : pakyak : pak",
            "test3 : yak123ya : 123ya",
            "test4 : yak : ''",
            "test5 : yakxxxyak : xxx",
            "test6 : HiyakHi : HiHi",
            "test7 : xxxyakyyyakzzz : xxxyyzzz",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = StringYak.stringYak(param);

        assertEquals(expected, result);
    }
}