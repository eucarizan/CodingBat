import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class MinCatTest {
    @ParameterizedTest(name = "{0} -- minCat({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hello : Hi : loHi",
            "test2 : Hello : java : ellojava",
            "test3 : java : Hello : javaello",
            "test4 : abc : x : cx",
            "test5 : x : abc : xc",
            "test6 : abc : '' : ''",
    }, delimiter = ':')
    public void test(String name, String a, String b, String expected) {
        var result = MinCat.minCat(a, b);

        assertEquals(expected, result);
    }
}