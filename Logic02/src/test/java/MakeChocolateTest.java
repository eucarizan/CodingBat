import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class MakeChocolateTest {
    @ParameterizedTest(name = "{0} -- makeChocolate({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : 4 : 1 : 9 : 4",
            "test2 : 4 : 1 : 10 : -1",
            "test3 : 4 : 1 : 7 : 2",
            "test4 : 6 : 2 : 7 : 2",
            "test5 : 4 : 1 : 5 : 0",
            "test6 : 4 : 1 : 4 : 4",
            "test7 : 5 : 4 : 9 : 4",
            "test8 : 9 : 3 : 18 : 3",
            "test9 : 3 : 1 : 9 : -1",
            "test10 : 1 : 2 : 7 : -1",
            "test11 : 1 : 2 : 6 : 1",
            "test12 : 1 : 2 : 5 : 0",
            "test13 : 6 : 1 : 10 : 5",
            "test14 : 6 : 1 : 11 : 6",
            "test15 : 6 : 1 : 12 : -1",
            "test16 : 6 : 1 : 13 : -1",
            "test17 : 6 : 2 : 10 : 0",
            "test18 : 6 : 2 : 11 : 1",
            "test19 : 6 : 2 : 12 : 2",
            "test20 : 60 : 100 : 550 : 50",
            "test21 : 1000 : 1000000 : 5000006 : 6",
            "test22 : 7 : 1 : 12 : 7",
            "test23 : 7 : 1 : 13 : -1",
            "test24 : 7 : 2 : 13 : 3",
    }, delimiter = ':')
    public void test(String name, int input, int b, int c, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = MakeChocolate.makeChocolate(input, b, c); // .toString()

        assertEquals(expected, result);
    }
}