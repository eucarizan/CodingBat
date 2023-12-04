import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class EndOtherTest {
    @ParameterizedTest(name = "{0} -- endOther({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : Hiabc : abc : true",
            "test2 : AbC : HiaBc : true",
            "test3 : abc : abXabc : true",
            "test4 : Hiabc : abcd : false",
            "test5 : Hiabc : bc : true",
            "test6 : Hiabcx : bc : false",
            "test7 : abc : abc : true",
            "test8 : xyz : 12xyz : true",
            "test9 : yz : 12xz : false",
            "test10 : Z : 12xz : true",
            "test11 : 12 : 12 : true",
            "test12 : abcXYZ : abcDEF : false",
            "test13 : ab : ab12 : false",
            "test14 : ab : 12ab : true",
    }, delimiter = ':')
    public void test(String name, String input, String b, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = EndOther.endOther(input, b); // .toString()

        assertEquals(expected, result);
    }
}