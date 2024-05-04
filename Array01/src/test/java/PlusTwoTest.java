import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class PlusTwoTest {
    @ParameterizedTest(name = "{0} -- plusTwo({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2 : 3, 4 : [1, 2, 3, 4]",
            "test2 : 4, 4 : 2, 2 : [4, 4, 2, 2]",
            "test3 : 9, 2 : 3, 4 : [9, 2, 3, 4]",
    }, delimiter = ':')
    public void test(String name, String a, String b, String expected) {
        int[] arrA = Arrays.stream(a.split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] arrB = Arrays.stream(b.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(PlusTwo.plusTwo(arrA, arrB)); // .toString()

        assertEquals(expected, result);
    }
}