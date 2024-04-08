import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.AddStar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

@SuppressWarnings("unused")
class AddStarTest {
    @ParameterizedTest(name = "{0} -- addStar({1}) == {2}")
    @DisplayName("addStar test")
    @CsvSource(value = {
            "test1 : a, bb, ccc : [a*, bb*, ccc*]",
            "test2 : hello, there : [hello*, there*]",
            "test3 : * : [**]",
            "test4 : '' : []",
            "test5 : kittens, and, chocolate, and : [kittens*, and*, chocolate*, and*]",
            "test6 : empty, string, '' : [empty*, string*, ''*]"
    }, delimiter = ':')
    public void test(String name, String input, String expected) {
        List<String> param;

        if (input.isEmpty()) {
            param = List.of();
        } else {
            param = Arrays.stream(input.split(", ")).toList();
        }

        var result = AddStar.addStar(param).toString();

        assertEquals(expected, result);
    }
}