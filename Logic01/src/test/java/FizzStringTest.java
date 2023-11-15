import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class FizzStringTest {
    @ParameterizedTest(name = "{0} -- fizzString({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : fig : Fizz",
            "test2 : dib : Buzz",
            "test3 : fib : FizzBuzz",
            "test4 : abc : abc",
            "test5 : fooo : Fizz",
            "test6 : booo : booo",
            "test7 : ooob : Buzz",
            "test8 : fooob : FizzBuzz",
            "test9 : f : Fizz",
            "test10 : b : Buzz",
            "test11 : abcb : Buzz",
            "test12 : Hello : Hello",
            "test13 : Hellob : Buzz",
            "test14 : af : af",
            "test15 : bf : bf",
            "test16 : fb : FizzBuzz",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = FizzString.fizzString(input); // .toString()

        assertEquals(expected, result);
    }
}