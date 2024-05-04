import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class AnswerCellTest {
    @ParameterizedTest(name = "{0} -- answerCell({1}, {2}, {3}) == {4}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : false : false : false : true",
            "test2 : false : false : true : false",
            "test3 : true : false : false : false",
            "test4 : true : true : false : true",
            "test5 : false : true : false : true",
            "test6 : true : true : true : false",
    }, delimiter = ':')
    public void test(String name, boolean input, boolean param, boolean isMom, boolean expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = AnswerCell.answerCell(input, param, isMom); // .toString()

        assertEquals(expected, result);
    }
}