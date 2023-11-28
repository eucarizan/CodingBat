# CodingBat - Logic-2

## Description
medium boolean logic puzzles -- if else && \|\| !

## Problems
number|solution|test|description
:-:|:-:|:-:|:--
1|[makeBricks](src/main/java/MakeBricks.java)|[unit test](src/test/java/MakeBricksTest.java)|We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.
2|[loneSum](src/main/java/LoneSum.java)|[unit test](src/test/java/LoneSumTest.java)|Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
3|[luckySum](src/main/java/LuckySum.java)|[unit test](src/test/java/LuckySumTest.java)|Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
4|[noTeenSum](src/main/java/NoTeenSum.java)|[unit test](src/test/java/NoTeenSumTest.java)|Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().
5|[roundSum](src/main/java/RoundSum.java)|[unit test](src/test/java/RoundSumTest.java)|For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
<hr/>
<!-- 0|[name](src/main/java)|[unit test](src/test/java)|desc-->

## Tags
- boolean, conditionals

[<<](../README.md#coding-bat)

