import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class SquirrelPlayTest {
    @ParameterizedTest(name = "{0} -- squirrelPlay({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 70 : false : true",
            "test2 : 95 : false : false",
            "test3 : 95 : true : true",
            "test4 : 90 : false : true",
            "test5 : 90 : true : true",
            "test6 : 50 : false : false",
            "test7 : 50 : true : false",
            "test8 : 100 : false : false",
            "test9 : 100 : true : true",
            "test10 : 105 : true : false",
            "test11 : 59 : false : false",
            "test12 : 59 : true : false",
            "test13 : 60 : false : true",
    }, delimiter = ':')
    public void test(String name, int input, boolean param, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = SquirrelPlay.squirrelPlay(input, param); // .toString()

        assertEquals(expected, result);
    }
}