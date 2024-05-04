import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class FizzString2Test {
    @ParameterizedTest(name = "{0} -- fizzString2({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1 : 1!",
            "test2 : 2 : 2!",
            "test3 : 3 : Fizz!",
            "test4 : 4 : 4!",
            "test5 : 5 : Buzz!",
            "test6 : 6 : Fizz!",
            "test7 : 7 : 7!",
            "test8 : 8 : 8!",
            "test9 : 9 : Fizz!",
            "test10 : 15 : FizzBuzz!",
            "test11 : 16 : 16!",
            "test12 : 18 : Fizz!",
            "test13 : 19 : 19!",
            "test14 : 21 : Fizz!",
            "test15 : 44 : 44!",
            "test16 : 45 : FizzBuzz!",
            "test17 : 100 : Buzz!",
    }, delimiter = ':')
    public void test(String name, int input, String expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = FizzString2.fizzString2(input); // .toString()

        assertEquals(expected, result);
    }
}