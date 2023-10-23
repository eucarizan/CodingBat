# CodingBat - Warmup-1

## Description
Simple warmup problems to get started

## Problems
number|solution|test|description
:-:|:-:|:-:|:--
1|[sleep in](src/main/java/SleepIn.java)|[unit test](src/test/java/SleepInTest.java)|We sleep in if it is not a weekday or we're on a vacation
2|[monkey trouble](src/main/java/MonkeyTrouble.java)|[unit test](src/test/java/MonkeyTroubleTest.java)|We are in trouble if both monkeys are smiling or if neither of them is smiling
3|[sum double](src/main/java/SumDouble.java)|[unit test](src/test/java/SumDoubleTest.java)|Given two int values, return their sum. Unless the two values are the same, then return double their sum
4|[diff21](src/main/java/Diff21.java)|[unit test](src/test/java/Diff21Test.java)|Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
5|[parrot trouble](src/main/java/ParrotTrouble.java)|[unit test](src/test/java/ParrotTroubleTest.java)|We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
6|[makes 10](src/main/java/Makes10.java)|[unit test](src/test/java/Makes10Test.java)|Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
7|[near hundred](src/main/java/NearHundred.java)|[unit test](src/test/java/NearHundredTest.java)|Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
8|[pos neg](src/main/java/PosNeg.java)|[unit test](src/test/java/PosNegTest.java)|Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
9|[not string](src/main/java/NotString.java)|[unit test](src/test/java/NotStringTest.java)|Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
10|[missing char](src/main/java/MissingChar.java)|[unit test](src/test/java/MissingCharTest.java)|Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
11|[front back](src/main/java/FrontBack.java)|[unit test](src/test/java/FrontBackTest.java)|Given a string, return a new string where the first and last chars have been exchanged.
12|[front 3](src/main/java/Front3.java)|[unit test](src/test/java/Front3Test.java)|Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
13|[back around](src/main/java/BackAround.java)|[unit test](src/test/java/BackAroundTest.java)|Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
14|[or35](src/main/java/Or35.java)|[unit test](src/test/java/Or35Test.java)|Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
15|[front22](src/main/java/Front22.java)|[unit test](src/test/java/Front22Test.java)|Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
16|[startHi](src/main/java/StartHi.java)|[unit test](src/test/java/StartHiTest.java)|Given a string, return true if the string starts with "hi" and false otherwise.
17|[icyHot](src/main/java/IcyHot.java)|[unit test](src/test/java/IcyHotTest.java)|Given two temperatures, return true if one is less than 0 and the other is greater than 100.
18|[in1020](src/main/java/In1020.java)|[unit test](src/test/java/In1020Test.java)|Given 2 int values, return true if either of them is in the range 10..20 inclusive.
19|[loneTeen](src/main/java/LoneTeen.java)|[unit test](src/test/java/LoneTeenTest.java)|We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
20|[delDel](src/main/java/DelDel.java)|[unit test](src/test/java/DelDelTest.java)|Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
21|[mixStart](src/main/java/MixStart.java)|[unit test](src/test/java/MixStartTest.java)|Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
22|[startOz](src/main/java/StartOz.java)|[unit test](src/test/java/StartOzTest.java)|Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
23|[intMax](src/main/java/IntMax.java)|[unit test](src/test/java/IntMaxTest.java)|Given three int values, a b c, return the largest.
24|[close10](src/main/java/Close10.java)|[unit test](src/test/java/Close10Test.java)|Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
25|[in3050](src/main/java/In3050.java)|[unit test](src/test/java/In3050Test.java)|Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
26|[max1020](src/main/java/Max1020.java)|[unit test](src/test/java/Max1020Test.java)|Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
27|[stringE](src/main/java/StringE.java)|[unit test](src/test/java/StringETest.java)|Return true if the given string contains between 1 and 3 'e' chars.
28|[lastDigit](src/main/java/LastDigit.java)|[unit test](src/test/java/LastDigitTest.java)|Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
<hr>
<!-- 0|[name](src/main/java)|[unit test](src/test/java)|desc -->

## Tags
- boolean, int
- logical operators

[<<](../README.md)