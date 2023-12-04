import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class NoobThereTest {
    @ParameterizedTest(name = "{0} -- noobThere({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : abcbob : true",
            "test2 : b9b : true",
            "test3 : bac : false",
            "test4 : bbb : true",
            "test5 : abcdefb : false",
            "test6 : 123abcbcdbabxyz : true",
            "test7 : b12 : false",
            "test8 : b1b : true",
            "test9 : b12b1b : true",
            "test10 : bbc : false",
            "test11 : bbb : true",
            "test12 : bb : false",
            "test13 : b : false",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = NoobThere.noobThere(input); // .toString()

        assertEquals(expected, result);
    }
}