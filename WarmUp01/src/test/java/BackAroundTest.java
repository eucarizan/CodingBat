import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class BackAroundTest {
    @ParameterizedTest(name = "{0} -- backAround({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : cat : tcatt",
            "test2 : Hello : oHelloo",
            "test3 : a : aaa",
            "test4 : abc : cabcc",
            "test5 : read : dreadd",
            "test6 : boo : obooo",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        String result = BackAround.backAround(param);

        assertEquals(expected, result);
    }

}