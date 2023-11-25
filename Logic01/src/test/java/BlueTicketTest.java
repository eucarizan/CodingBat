import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class BlueTicketTest {
    @ParameterizedTest(name = "{0} -- blueTicket({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 9 : 1 : 0 : 10",
            "test2 : 9 : 2 : 0 : 0",
            "test3 : 6 : 1 : 4 : 10",
            "test4 : 6 : 1 : 5 : 0",
            "test5 : 10 : 0 : 0 : 10",
            "test6 : 15 : 0 : 5 : 5",
            "test7 : 5 : 15 : 5 : 10",
            "test8 : 4 : 11 : 1 : 5",
            "test9 : 13 : 2 : 3 : 5",
            "test10 : 8 : 4 : 3 : 0",
            "test11 : 8 : 4 : 2 : 10",
            "test12 : 8 : 4 : 1 : 0",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = BlueTicket.blueTicket(a, b, c); // .toString()

        assertEquals(expected, result);
    }
}