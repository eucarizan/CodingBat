import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class XyzThereTest {
    @ParameterizedTest(name = "{0} -- xyzThere({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : abcxyz : true",
            "test2 : abc.xyz : false",
            "test3 : xyz.abc : true",
            "test4 : abcxy : false",
            "test5 : xyz : true",
            "test6 : xy : false",
            "test7 : x : false",
            "test8 : '' : false",
            "test9 : abc.xyzxyz : true",
            "test10 : abc.xxyz : true",
            "test11 : .xyz : false",
            "test12 : 12.xyz : false",
            "test13 : 12xyz : true",
            "test14 : 1.xyz.xyz2.xyz : false",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = XyzThere.xyzThere(input); // .toString()

        assertEquals(expected, result);
    }
}