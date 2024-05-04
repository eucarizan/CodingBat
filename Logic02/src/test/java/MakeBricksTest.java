import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MakeBricksTest {
    @ParameterizedTest(name = "{0} -- makeBricks({1}, {2}, {3} == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 3 : 1 : 8 : true",
            "test2 : 3 : 1 : 9 : false",
            "test3 : 3 : 2 : 10 : true",
            "test4 : 3 : 2 : 8 : true",
            "test5 : 3 : 2 : 9 : false",
            "test6 : 6 : 1 : 11 : true",
            "test7 : 6 : 0 : 11 : false",
            "test8 : 1 : 4 : 11 : true",
            "test9 : 0 : 3 : 10 : true",
            "test10 : 1 : 4 : 12 : false",
            "test11 : 3 : 1 : 7 : true",
            "test13 : 1 : 1 : 7 : false",
            "test13 : 2 : 1 : 7 : true",
            "test14 : 7 : 1 : 11 : true",
            "test15 : 7 : 1 : 8 : true",
            "test16 : 7 : 1 : 13 : false",
            "test17 : 43 : 1 : 46 : true",
            "test18 : 40 : 1 : 46 : false",
            "test19 : 40 : 2 : 47 : true",
            "test20 : 40 : 2 : 50 : true",
            "test21 : 40 : 2 : 52 : false",
            "test22 : 22 : 2 : 33 : false",
            "test23 : 0 : 2 : 10 : true",
            "test24 : 1000000 : 1000 : 1000100 : true",
            "test25 : 2 : 1000000 : 100003 : false",
            "test26 : 20 : 0 : 19 : true",
            "test27 : 20 : 0 : 21 : false",
            "test28 : 20 : 4 : 51 : false",
            "test29 : 20 : 4 : 39 : true",
    }, delimiter = ':')
    public void test(String name, int input, int param, int goal, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = MakeBricks.makeBricks(input, param, goal); // .toString()

        assertEquals(expected, result);
    }
}