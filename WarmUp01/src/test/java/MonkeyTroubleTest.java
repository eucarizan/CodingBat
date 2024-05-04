import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class MonkeyTroubleTest {

    @ParameterizedTest(name = "{0} -- checkSmile({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testBothSmiling : true : true : true",
            "testBothNotSmiling : false : false : true",
            "testOnlyMonkeyASmiling : true : false : false",
            "testOnlyMonkeyBSmiling : false : true : false",
    }, delimiter = ':')
    public void test(String name, boolean aSmile, boolean bSmile, boolean expected) {
        boolean result = MonkeyTrouble.checkSmile(aSmile, bSmile);

        assertEquals(expected, result);
    }
}
