import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class CommonEndTest {
    @ParameterizedTest(name = "{0} -- commonEnd([{1}], [{2}]) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : 7, 3 : true",
            "test2 : 1, 2, 3 : 7, 3, 2 : false",
            "test3 : 1, 2, 3 : 1, 3 : true",
            "test4 : 1, 2, 3 : 1 : true",
            "test5 : 1, 2, 3 : 2 : false",
    }, delimiter = ':')
    public void test(String name, String aStr, String bStr, boolean expected) {
        int[] a = Arrays.stream(aStr.split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(bStr.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = CommonEnd.commonEnd(a, b);

        assertEquals(expected, result);
    }
}