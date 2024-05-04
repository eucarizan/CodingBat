import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class GreenTicketTest {
    @ParameterizedTest(name = "{0} -- greenTicket({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1 : 2 : 3 : 0",
            "test2 : 2 : 2 : 2 : 20",
            "test3 : 1 : 1 : 2 : 10",
            "test4 : 2 : 1 : 1 : 10",
            "test5 : 1 : 2 : 1 : 10",
            "test6 : 3 : 2 : 1 : 0",
            "test7 : 0 : 0 : 0 : 20",
            "test8 : 2 : 0 : 0 : 10",
            "test9 : 0 : 9 : 10 : 0",
            "test10 : 0 : 10 : 0 : 10",
            "test11 : 9 : 9 : 9 : 20",
            "test12 : 9 : 0 : 9 : 10",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = GreenTicket.greenTicket(a, b, c); // .toString()

        assertEquals(expected, result);
    }
}