import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class Copies3Test {
    @ParameterizedTest(name = "{0} -- copies3({1}) == {2}")
    @DisplayName("copies3 test")
    @CsvSource(value = {
            "test1 : a, bb, ccc : [aaa, bbbbbb, ccccccccc]",
            "test2 : 24, a : [242424, aaa]",
            "test3 : hello, there : [hellohellohello, theretherethere]",
            "test4 : no : [nonono]",
            "test5 : '' : []",
            "test6 : this, and, that, and : [thisthisthis, andandand, thatthatthat, andandand]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<String> param;

        if (input.isEmpty()) {
            param = List.of();
        } else {
            param = Arrays.stream(input.split(", ")).toList();
        }

        var result = Copies3.copies3(param).toString();

        assertEquals(expected, result);
    }
}