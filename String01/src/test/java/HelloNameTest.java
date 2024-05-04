import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class HelloNameTest {
    @ParameterizedTest(name = "{0} -- helloName({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Bob : Hello Bob!",
            "test2 : Alice : Hello Alice!",
            "test3 : X : Hello X!",
            "test4 : Dolly : Hello Dolly!",
            "test5 : Alpha : Hello Alpha!",
            "test6 : Omega : Hello Omega!",
            "test7 : Goodbye : Hello Goodbye!",
            "test8 : ho ho ho : Hello ho ho ho!",
            "test9 : xyz! : Hello xyz!!",
            "test10 : Hello : Hello Hello!",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = HelloName.helloName(param);

        assertEquals(expected, result);
    }
}