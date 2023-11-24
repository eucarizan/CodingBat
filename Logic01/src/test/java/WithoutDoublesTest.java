import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class WithoutDoublesTest {
    @ParameterizedTest(name = "{0} -- withoutDoubles({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 2 : 3 : true : 5",
            "test2 : 3 : 3 : true : 7",
            "test3 : 3 : 3 : false : 6",
            "test4 : 2 : 3 : false : 5",
            "test5 : 5 : 4 : true : 9",
            "test6 : 5 : 4 : false : 9",
            "test7 : 5 : 5 : true : 11",
            "test8 : 5 : 5 : false : 10",
            "test9 : 6 : 6 : true : 7",
            "test10 : 6 : 6 : false : 12",
            "test11 : 1 : 6 : true : 7",
            "test12 : 6 : 1 : false : 7",
    }, delimiter = ':')
    public void test(String name, int a, int b, boolean param, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = WithoutDoubles.withoutDoubles(a, b, param); // .toString()

        assertEquals(expected, result);
    }
}