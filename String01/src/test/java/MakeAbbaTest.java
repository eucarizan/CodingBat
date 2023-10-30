import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class MakeAbbaTest {
    @ParameterizedTest(name = "{0} -- method({1}, {2}) == {3}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : Hi : Bye : HiByeByeHi",
            "test2 : Yo : Alice : YoAliceAliceYo",
            "test3 : What : Up : WhatUpUpWhat",
            "test4 : aaa : bbb : aaabbbbbbaaa",
            "test5 : x : y : xyyx",
            "test6 : x : '' : xx",
            "test7 : '' : y : yy",
            "test8 : Bo : Ya : BoYaYaBo",
            "test9 : Ya : Ya : YaYaYaYa",
    }, delimiter = ':')
    public void test(String name, String a, String b, String expected) {
        var result = MakeAbba.makeAbba(a, b);

        assertEquals(expected, result);
    }
}