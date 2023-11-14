import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class More20Test {
    @ParameterizedTest(name = "{0} -- more20({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 20 : false",
            "test2 : 21 : true",
            "test3 : 22 : true",
            "test4 : 23 : false",
            "test5 : 25 : false",
            "test6 : 30 : false",
            "test7 : 31 : false",
            "test8 : 59 : false",
            "test9 : 60 : false",
            "test10 : 61 : true",
            "test11 : 62 : true",
            "test12 : 1020 : false",
            "test13 : 1021 : true",
            "test14 : 1000 : false",
            "test15 : 1001 : true",
            "test16 : 50 : false",
            "test17 : 55 : false",
            "test18 : 40 : false",
            "test19 : 41 : true",
            "test20 : 39 : false",
            "test21 : 42 : true",
    }, delimiter = ':')
    public void test(String name, int input, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = More20.more20(input); // .toString()

        assertEquals(expected, result);
    }
}