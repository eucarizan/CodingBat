import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class FrontPieceTest {
    @ParameterizedTest(name = "{0} -- frontPiece({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : 1, 2, 3 : [1, 2]",
            "test2 : 1, 2 : [1, 2]",
            "test3 : 1 : [1]",
            "test4 : 6, 5, 0 : [6, 5]",
            "test5 : 6, 5 : [6, 5]",
            "test6 : 3, 1, 4, 1, 5 : [3, 1]",
            "test7 : 6 : [6]",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = Arrays.toString(FrontPiece.frontPiece(param)); // .toString()

        assertEquals(expected, result);
    }
}