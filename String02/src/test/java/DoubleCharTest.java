import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class DoubleCharTest {
    @ParameterizedTest(name = "{0} -- doubleChar({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {"test1 : The : TThhee",
            "test2 : AAbb : AAAAbbbb",
            "test3 : Hi-There : HHii--TThheerree",
            "test4 : Word! : WWoorrdd!!",
            "test5 : !! : !!!!",
            "test6 : '' : ''",
            "test7 : a : aa",
            "test8 : . : ..",
            "test9 : aa : aaaa",
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        // int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = DoubleChar.doubleChar(input); // .toString()

        assertEquals(expected, result);
    }
}