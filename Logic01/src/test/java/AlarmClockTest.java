import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class AlarmClockTest {
    @ParameterizedTest(name = "{0} -- alarmClock({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 ; 1 ; false ; 7:00",
            "test2 ; 5 ; false ; 7:00",
            "test3 ; 0 ; false ; 10:00",
            "test4 ; 6 ; false ; 10:00",
            "test5 ; 0 ; true ; off",
            "test6 ; 6 ; true ; off",
            "test7 ; 1 ; true ; 10:00",
            "test8 ; 3 ; true ; 10:00",
            "test9 ; 5 ; true ; 10:00",
    }, delimiter = ';')
    public void test(String name, int input, boolean param, String expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = AlarmClock.alarmClock(input, param); // .toString()

        assertEquals(expected, result);
    }
}