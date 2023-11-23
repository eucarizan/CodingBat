import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class TwoAsOneTest {
    @ParameterizedTest(name = "{0} -- twoAsOne({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1 : 2 : 3 : true",
            "test2 : 3 : 1 : 2 : true",
            "test3 : 3 : 2 : 2 : false",
            "test4 : 2 : 3 : 1 : true",
            "test5 : 5 : 3 : -2 : true",
            "test6 : 5 : 3 : -3 : false",
            "test7 : 2 : 5 : 3 : true",
            "test8 : 9 : 5 : 5 : false",
            "test9 : 9 : 4 : 5 : true",
            "test10 : 5 : 4 : 9 : true",
            "test11 : 3 : 3 : 0 : true",
            "test12 : 3 : 3 : 2 : false",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = TwoAsOne.twoAsOne(a, b, c); // .toString()

        assertEquals(expected, result);
    }
}