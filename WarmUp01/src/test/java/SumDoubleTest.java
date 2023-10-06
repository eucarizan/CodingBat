import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class SumDoubleTest {
    @ParameterizedTest(name = "{0} -- sumDouble({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "testSumNotDouble1 : 1 : 2 : 3",
            "testSumNotDouble2 : 3 : 2 : 5",
            "testSumDouble : 2 : 2 : 8",
            "testSumWithNegative : -1 : 0 : -1",
            "testSum1 : 3 : 3 : 12",
            "testSum2 : 0 : 0 : 0",
            "testSum3 : 0 : 1 : 1",
            "testSum4 : 3 : 4 : 7",
    }, delimiter = ':')
    public void test(String name, int aSmile, int bSmile, int expected) {
        int result = SumDouble.add(aSmile, bSmile);

        assertEquals(expected, result);
    }
}