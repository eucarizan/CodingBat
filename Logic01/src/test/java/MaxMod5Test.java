import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MaxMod5Test {
    @ParameterizedTest(name = "{0} -- maxMod5({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 2 : 3 : 3",
            "test2 : 6 : 2 : 6",
            "test3 : 3 : 2 : 3",
            "test4 : 8 : 12 : 12",
            "test5 : 7 : 12 : 7",
            "test6 : 11 : 6 : 6",
            "test7 : 2 : 7 : 2",
            "test8 : 7 : 7 : 0",
            "test9 : 9 : 1 : 9",
            "test10 : 9 : 14 : 9",
            "test11 : 1 : 2 : 2",
    }, delimiter = ':')
    public void test(String name, int input, int param, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = MaxMod5.maxMod5(input, param); // .toString()

        assertEquals(expected, result);
    }
}