import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.Lower;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class LowerTest {
    @ParameterizedTest(name = "{0} -- lower({1}) == {2}")
    @DisplayName("lower test")
    @CsvSource(value = {
            "test1 : Hello, Hi : [hello, hi]",
            "test2 : AAA, BBB, ccc : [aaa, bbb, ccc]",
            "test3 : KitteN, ChocolaTE : [kitten, chocolate]",
            "test4 : '' : []",
            "test5 : EMPTY: [empty]",
            "test6 : aaX, bYb, Ycc, ZZZ : [aax, byb, ycc, zzz]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
        List<String> param = Arrays.stream(input.split(", ")).toList();

        var result = Lower.lower(param).toString(); // .toString()

        assertEquals(expected, result);
    }
}