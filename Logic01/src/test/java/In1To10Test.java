import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class In1To10Test {
    @ParameterizedTest(name = "{0} -- in1To10({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 5 : false : true",
            "test2 : 11 : false : false",
            "test3 : 11 : true : true",
            "test4 : 10 : false : true",
            "test5 : 10 : true : true",
            "test6 : 9 : false : true",
            "test7 : 9 : true : false",
            "test8 : 1 : false : true",
            "test9 : 1 : true : true",
            "test10 : 0 : false : false",
            "test11 : 0 : true : true",
            "test12 : -1 : false : false",
            "test13 : -1 : true : true",
            "test14 : 99 : false : false",
            "test15 : -99 : true : true",
    }, delimiter = ':')
    public void test(String name, int input, boolean param, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = In1To10.in1To10(input, param); // .toString()

        assertEquals(expected, result);
    }
}