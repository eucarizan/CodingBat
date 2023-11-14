import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class SpecialElevenTest {
    @ParameterizedTest(name = "{0} -- specialEleven({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 22 : true",
            "test2 : 23 : true",
            "test3 : 24 : false",
            "test4 : 21 : false",
            "test5 : 11 : true",
            "test6 : 12 : true",
            "test7 : 10 : false",
            "test8 : 9 : false",
            "test9 : 8 : false",
            "test10 : 0 : true",
            "test11 : 1 : true",
            "test12 : 2 : false",
            "test13 : 121 : true",
            "test15 : 122 : true",
            "test15 : 123 : false",
            "test16 : 46 : false",
            "test17 : 49 : false",
            "test18 : 52 : false",
            "test19 : 54 : false",
            "test20 : 55 : true",
    }, delimiter = ':')
    public void test(String name, int input, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = SpecialEleven.specialEleven(input); // .toString()

        assertEquals(expected, result);
    }
}