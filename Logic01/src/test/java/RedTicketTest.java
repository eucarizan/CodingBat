import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class RedTicketTest {
    @ParameterizedTest(name = "{0} -- redTicket({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 2 : 2 : 2 : 10",
            "test2 : 2 : 2 : 1 : 0",
            "test3 : 0 : 0 : 0 : 5",
            "test4 : 2 : 0 : 0 : 1",
            "test5 : 1 : 1 : 1 : 5",
            "test6 : 1 : 2 : 1 : 0",
            "test7 : 1 : 2 : 0 : 1",
            "test8 : 0 : 2 : 2 : 1",
            "test9 : 1 : 2 : 2 : 1",
            "test10 : 0 : 2 : 0 : 0",
            "test11 : 1 : 1 : 2 : 0",
    }, delimiter = ':')
    public void test(String name, int a, int b, int c, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = RedTicket.redTicket(a, b, c); // .toString()

        assertEquals(expected, result);
    }
}