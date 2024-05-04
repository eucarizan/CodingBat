import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.NoX;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class NoXTest {
    @ParameterizedTest(name = "{0} -- noX({1}) == {2}")
    @DisplayName("noX test")
    @CsvSource(value = {
            "test1 : ax, bb, cx : [a, bb, c]",
            "test2 : xxax, xbxbx, xxcx : [a, bb, c]",
            "test3 : x : []",
            "test4 : '' : []",
            "test5 : the, taxi : [the, tai]",
            "test6 : the, xxtxaxixxx : [the, tai]",
            "test7 : this, is, the, x : [this, is, the, ]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
        List<String> param = Arrays.stream(input.split(", ")).toList();

        var result = NoX.noX(param).toString(); // .toString()

        assertEquals(expected, result);
    }
}