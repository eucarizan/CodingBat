import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class TeaPartyTest {
    @ParameterizedTest(name = "{0} -- teaParty({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 6 : 8 : 1",
            "test2 : 3 : 8 : 0",
            "test3 : 20 : 6 : 2",
            "test4 : 12 : 6 : 2",
            "test5 : 11 : 6 : 1",
            "test6 : 11 : 4 : 0",
            "test7 : 4 : 5 : 0",
            "test8 : 5 : 5 : 1",
            "test9 : 6 : 6 : 1",
            "test10 : 5 : 10 : 2",
            "test11 : 5 : 9 : 1",
            "test12 : 10 : 4 : 0",
            "test13 : 10 : 20 : 2",
    }, delimiter = ':')
    public void test(String name, int input, int param, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = TeaParty.teaParty(input, param); // .toString()

        assertEquals(expected, result);
    }
}