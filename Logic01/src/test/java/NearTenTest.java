import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class NearTenTest {
    @ParameterizedTest(name = "{0} -- nearTen({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 12 : true",
            "test2 : 17 : false",
            "test3 : 19 : true",
            "test4 : 31 : true",
            "test5 : 6 : false",
            "test6 : 10 : true",
            "test7 : 11 : true",
            "test8 : 21 : true",
            "test9 : 22 : true",
            "test10 : 23 : false",
            "test11 : 54 : false",
            "test12 : 155 : false",
            "test13 : 158 : true",
            "test14 : 3 : false",
            "test15 : 1 : true",
    }, delimiter = ':')
    public void test(String name, int input, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = NearTen.nearTen(input); // .toString()

        assertEquals(expected, result);
    }
}