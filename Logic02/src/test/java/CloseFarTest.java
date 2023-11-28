import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class CloseFarTest {
    @ParameterizedTest(name = "{0} -- closeFar({1}, {2}, {3}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : 1 : 2 : 10 : true",
            "test2 : 1 : 2 : 3 : false",
            "test3 : 4 : 1 : 3 : true",
            "test4 : 4 : 5 : 3 : false",
            "test5 : 4 : 3 : 5 : false",
            "test6 : -1 : 10 : 0 : true",
            "test7 : 0 : -1 : 10 : true",
            "test8 : 10 : 10 : 8 : true",
            "test9 : 10 : 8 : 9 : false",
            "test10 : 8 : 9 : 10 : false",
            "test11 : 8 : 9 : 7 : false",
            "test12 : 8 : 6 : 9 : true",
    }, delimiter = ':')
    public void test(String name, int input, int param, int c, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = CloseFar.closeFar(input, param, c); // .toString()

        assertEquals(expected, result);
    }
}