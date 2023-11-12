import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class DateFashionTest {
    @ParameterizedTest(name = "{0} -- dateFashion({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 5 : 10 : 2",
            "test2 : 5 : 2 : 0",
            "test3 : 5 : 5 : 1",
            "test4 : 3 : 3 : 1",
            "test5 : 10 : 2 : 0",
            "test6 : 2 : 9 : 0",
            "test7 : 9 : 9 : 2",
            "test8 : 10 : 5 : 2",
            "test9 : 2 : 2 : 0",
            "test10 : 3 : 7 : 1",
            "test11 : 2 : 7 : 0",
            "test12 : 6 : 2 : 0",
    }, delimiter = ':')
    public void test(String name, int input, int param, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = DateFashion.dateFashion(input, param); // .toString()

        assertEquals(expected, result);
    }
}