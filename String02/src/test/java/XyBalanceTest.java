import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class XyBalanceTest {
    @ParameterizedTest(name = "{0} -- xyBalance({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : aaxbby : true",
            "test2 : aaxbb : false",
            "test3 : yaaxbb : false",
            "test4 : yaaxbby : true",
            "test5 : xaxxbby : true",
            "test6 : xaxxbbyx : false",
            "test7 : xxbxy : true",
            "test8 : xxbx : false",
            "test9 : bbb : true",
            "test10 : bxbb : false",
            "test11 : bxyb : true",
            "test12 : xy : true",
            "test13 : y : true",
            "test14 : x : false",
            "test15 : '' : true",
            "test16 : yxyxyxyx : false",
            "test17 : yxyxyxyxy : true",
            "test18 : 12xabxxydxyxyzz : true",
    }, delimiter = ':')
    public void test(String name, String input, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = XyBalance.xyBalance(input); // .toString()

        assertEquals(expected, result);
    }
}