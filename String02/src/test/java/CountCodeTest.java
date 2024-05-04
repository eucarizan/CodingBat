import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class CountCodeTest {
    @ParameterizedTest(name = "{0} -- countCode({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : aaacodebbb : 1",
            "test2 : codexxcode : 2",
            "test3 : cozexxcope : 2",
            "test4 : cozfxxcope : 1",
            "test5 : xxcozeyycop : 1",
            "test6 : cozcop : 0",
            "test7 : abcxyz : 0",
            "test8 : code : 1",
            "test9 : ode : 0",
            "test10 : c : 0",
            "test11 : '' : 0",
            "test12 : AAcodeBBcoleCCccoreDD : 3",
            "test13 : AAcodeBBcoleCCccorfDD : 2",
            "test14 : coAcodeBcoleccoreDD : 3",
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = CountCode.countCode(input); // .toString()

        assertEquals(expected, result);
    }
}