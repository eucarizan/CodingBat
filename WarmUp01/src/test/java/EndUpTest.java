import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class EndUpTest {
    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : HeLLO",
            "test2 : hi there : hi thERE",
            "test3 : hi : HI",
            "test4 : woo hoo : woo HOO",
            "test5 : xyz12 : xyZ12",
            "test6 : x : X",
            "test7 : '' : ''",
    }, delimiter = ':')
    public void test(String name, String param, String expected) {
        var result = EndUp.endUp(param);

        assertEquals(expected, result);
    }
}