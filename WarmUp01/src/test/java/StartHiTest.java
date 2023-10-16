import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class StartHiTest {
    @ParameterizedTest(name = "{0} -- startHi({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : hi there : true ",
            "test2 : hi : true ",
            "test3 : hello hi : false ",
            "test4 : he : false ",
            "test5 : h : false ",
            "test6 : '' : false ",
            "test7 : ho hi : false ",
            "test8 : hi ho : true ",
    }, delimiter = ':')
    public void test(String name, String param, boolean expected) {
        boolean result = StartHi.startHi(param);

        assertEquals(expected, result);
    }

}