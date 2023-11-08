import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MiddleWayTest {
    @ParameterizedTest(name = "{0} -- middleWay({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : 4, 5, 6 : [2, 5]",
            "test2 : 7, 7, 7 : 3, 8, 0 : [7, 8]",
            "test3 : 5, 2, 9 : 1, 4, 5 : [2, 4]",
            "test4 : 1, 9, 7 : 4, 8, 8 : [9, 8]",
            "test5 : 1, 2, 3 : 3, 1, 4 : [2, 1]",
            "test6 : 1, 2, 3 : 4, 1, 1 : [2, 1]",
    }, delimiter = ':')
    public void test(String name, String input1, String input2, String expected) {
        int[] param1 = Arrays.stream(input1.split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] param2 = Arrays.stream(input2.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(MiddleWay.middleWay(param1, param2));

        assertEquals(expected, result);
    }
}