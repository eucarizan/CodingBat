import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class CountHiTest {
    @ParameterizedTest(name = "{0} -- countHi({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : abc hi ho : 1",
            "test2 : ABChi hi : 2",
            "test3 : hihi : 2",
            "test4 : hiHIhi : 2",
            "test5 : '' : 0",
            "test6 : h : 0",
            "test7 : hi : 1",
            "test8 : Hi is no HI on ahI : 0",
            "test9 : hiho not HOHIhi : 2",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = CountHi.countHi(input); // .toString()

        assertEquals(expected, result);
    }
}