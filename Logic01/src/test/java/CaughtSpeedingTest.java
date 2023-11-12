import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class CaughtSpeedingTest {
    @ParameterizedTest(name = "{0} -- caughtSpeeding({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 60 : false : 0",
            "test2 : 65 : false : 1",
            "test3 : 65 : true : 0",
            "test4 : 80 : false : 1",
            "test5 : 85 : false : 2",
            "test6 : 85 : true : 1",
            "test7 : 70 : false : 1",
            "test8 : 75 : false : 1",
            "test9 : 75 : true : 1",
            "test10 : 40 : false : 0",
            "test11 : 40 : true : 0",
            "test12 : 90 : false : 2",
    }, delimiter = ':')
    public void test(String name, int input, boolean param, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = CaughtSpeeding.caughtSpeeding(input, param); // .toString()

        assertEquals(expected, result);
    }
}