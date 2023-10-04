import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class SleepInTest {

    @ParameterizedTest(name = "{0} -- sleepIn({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testWeekendNotVacation : false : false : true",
            "testWeekdayNotVacation : true : false : false",
            "testWeekendVacation : false : false : true",
            "testWeekdayVacation : true : true : true",
    }, delimiter = ':')
    public void test(String name, boolean weekday, boolean vacation, boolean expected) {
        boolean result = SleepIn.method(weekday, vacation);

        assertEquals(expected, result);
    }
}
