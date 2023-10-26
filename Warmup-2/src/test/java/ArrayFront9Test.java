import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class ArrayFront9Test {
    @ParameterizedTest(name = "{0} -- method({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 9, 3, 4 : true",
            "test2 : 1, 2, 3, 4, 9 : false",
            "test3 : 1, 2, 3, 4, 5 : false",
            "test4 : 9, 2, 3 : true",
            "test5 : 1, 9, 9 : true",
            "test6 : 1, 2, 3 : false",
            "test7 : 1, 9 : true",
            "test8 : 5, 5 : false",
            "test9 : 2 : false",
            "test10 : 9 : true",
            "test11 : 3, 9, 2, 3, 3 : true",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = ArrayFront9.arrayFront9(param);

        assertEquals(expected, result);
    }
}