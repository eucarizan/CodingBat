import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class CatDogTest {
    @ParameterizedTest(name = "{0} -- catDog({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : catdog : true",
            "test2 : catcat : false",
            "test3 : 1cat1cadodog : true",
            "test4 : catxxdogxxxdog : false",
            "test5 : catxdogxdogxcat : true",
            "test6 : catxdogxdogxca : false",
            "test7 : dogdogcat : false",
            "test8 : dogogcat : true",
            "test9 : dog : false",
            "test10 : cat : false",
            "test11 : ca : true",
            "test12 : c : true",
            "test13 : '' : true",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = CatDog.catDog(input); // .toString()

        assertEquals(expected, result);
    }
}