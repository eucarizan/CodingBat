import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class InOrderTest {
    @ParameterizedTest(name = "{0} -- inOrder({1}, {2}, {3}, {4}) == {5}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1 : 2 : 4 : false : true",
            "test2 : 1 : 2 : 1 : false : false",
            "test3 : 1 : 1 : 2 : true : true",
            "test4 : 3 : 2 : 4 : false : false",
            "test5 : 2 : 3 : 4 : false : true",
            "test6 : 3 : 2 : 4 : true : true",
            "test7 : 4 : 2 : 2 : true : false",
            "test8 : 4 : 5 : 2 : true : false",
            "test9 : 2 : 4 : 6 : true : true",
            "test10 : 7 : 9 : 10 : false : true",
            "test11 : 7 : 5 : 6 : true : true",
            "test12 : 7 : 5 : 4 : true : false",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, boolean param, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = InOrder.inOrder(a, b, c, param); // .toString()

        assertEquals(expected, result);
    }
}