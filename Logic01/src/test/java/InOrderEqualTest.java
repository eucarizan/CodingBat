import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class InOrderEqualTest {
    @ParameterizedTest(name = "{0} -- inOrderEqual({1}, {2}, {3}, {4}) == {5}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 2 : 5 : 11 : false : true",
            "test2 : 5 : 7 : 6 : false : false",
            "test3 : 5 : 5 : 7 : true : true",
            "test4 : 5 : 5 : 7 : false : false",
            "test5 : 2 : 5 : 4 : false : false",
            "test6 : 3 : 4 : 3 : false : false",
            "test7 : 3 : 4 : 4 : false : false",
            "test8 : 3 : 4 : 3 : true : false",
            "test9 : 3 : 4 : 4 : true : true",
            "test10 : 1 : 5 : 5 : true : true",
            "test11 : 5 : 5 : 5 : true : true",
            "test12 : 2 : 2 : 1 : true : false",
            "test13 : 9 : 2 : 2 : true : false",
            "test14 : 0 : 1 : 0 : true : false",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, boolean param, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = InOrderEqual.inOrderEqual(a, b, c, param); // .toString()

        assertEquals(expected, result);
    }
}