import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class Less20Test {
    @ParameterizedTest(name = "{0} -- less20({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 18 : true",
            "test2 : 19 : true",
            "test3 : 20 : false",
            "test4 : 8 : false",
            "test5 : 17 : false",
            "test6 : 23 : false",
            "test7 : 25 : false",
            "test8 : 30 : false",
            "test9 : 31 : false",
            "test10 : 58 : true",
            "test11 : 59 : true",
            "test12 : 60 : false",
            "test13 : 61 : false",
            "test14 : 62 : false",
            "test15 : 1017 : false",
            "test16 : 1018 : true",
            "test17 : 1019 : true",
            "test18 : 1020 : false",
            "test19 : 1021 : false",
            "test20 : 1022 : false",
            "test21 : 1023 : false",
            "test22 : 37 : false",
    }, delimiter = ':')
    public void test(String name, int input, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Less20.less20(input); // .toString()

        assertEquals(expected, result);
    }
}