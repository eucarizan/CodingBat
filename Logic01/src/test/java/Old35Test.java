import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Old35Test {
    @ParameterizedTest(name = "{0} -- old35({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 3 : true",
            "test2 : 10 : true",
            "test3 : 15 : false",
            "test4 : 5 : true",
            "test5 : 9 : true",
            "test6 : 8 : false",
            "test7 : 7 : false",
            "test8 : 6 : true",
            "test9 : 17 : false",
            "test10 : 18 : true",
            "test11 : 29 : false",
            "test12 : 20 : true",
            "test13 : 21 : true",
            "test14 : 22 : false",
            "test15 : 45 : false",
            "test16 : 99 : true",
    }, delimiter = ':')
    public void test(String name, int input, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Old35.old35(input); // .toString()

        assertEquals(expected, result);
    }
}