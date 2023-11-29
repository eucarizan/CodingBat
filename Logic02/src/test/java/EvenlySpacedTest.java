import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class EvenlySpacedTest {
    @ParameterizedTest(name = "{0} -- evenlySpaced({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : 2 : 4 : 6 : true",
            "test2 : 4 : 6 : 2 : true",
            "test3 : 4 : 6 : 3 : false",
            "test4 : 6 : 2 : 4 : true",
            "test5 : 6 : 2 : 8 : false",
            "test6 : 2 : 2 : 2 : true",
            "test7 : 2 : 2 : 3 : false",
            "test8 : 9 : 10 : 11 : true",
            "test9 : 10 : 9 : 11 : true",
            "test10 : 10 : 9 : 9 : false",
            "test11 : 2 : 4 : 4 : false",
            "test12 : 2 : 2 : 4 : false",
            "test13 : 3 : 6 : 12 : false",
            "test14 : 12 : 3 : 6 : false",
    }, delimiter = ':')
    public void test(String name, int input, int param, int c, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = EvenlySpaced.evenlySpaced(input, param, c); // .toString()

        assertEquals(expected, result);
    }
}