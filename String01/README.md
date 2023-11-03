# CodingBat - String-1

## Description
basic string problems -- no loops

## Problems
number|solution|test|description
:-:|:-:|:-:|:--
1|[helloName](src/main/java/HelloName.java)|[unit test](src/test/java/HelloNameTest.java)|Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
2|[makeAbba](src/main/java/MakeAbba.java)|[unit test](src/test/java/MakeAbbaTest.java)|Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
3|[makeTags](src/main/java/MakeTags.java)|[unit test](src/test/java/MakeTagsTest.java)|The web is built with HTML strings like "\<i\>Yay\</i\>" which draws Yay as italic text. In this example, the "i" tag makes \<i\> and \</i\> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "\<i\>Yay\</i\>".
4|[makeOutWord](src/main/java/MakeOutWord.java)|[unit test](src/test/java/MakeOutWordTest.java)|Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
5|[extraEnd](src/main/java/ExtraEnd.java)|[unit test](src/test/java/ExtraEndTest.java)|Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
6|[firstTwo](src/main/java/FirstTwo.java)|[unit test](src/test/java/FirstTwoTest.java)|Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
7|[firstHalf](src/main/java/FirstHalf.java)|[unit test](src/test/java/FirstHalfTest.java)|Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
8|[withoutEnd](src/main/java/WithoutEnd.java)|[unit test](src/test/java/WithoutEndTest.java)|Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
9|[comboString](src/main/java/ComboString.java)|[unit test](src/test/java/ComboStringTest.java)|Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
10|[nonStart](src/main/java/NonStart.java)|[unit test](src/test/java/NonStartTest.java)|Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
11|[left2](src/main/java/Left2.java)|[unit test](src/test/java/Left2Test.java)|Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
12|[right2](src/main/java/Right2.java)|[unit test](src/test/java/Right2Test.java)|Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
13|[theEnd](src/main/java/TheEnd.java)|[unit test](src/test/java/TheEndTest.java)|Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
14|[withoutEnd2](src/main/java/WithoutEnd2.java)|[unit test](src/test/java/WithoutEnd2Test.java)|Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
15|[middleTwo](src/main/java/MiddleTwo.java)|[unit test](src/test/java/MiddleTwoTest.java)|Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
16|[endsLy](src/main/java/EndsLy.java)|[unit test](src/test/java/EndsLyTest.java)|Given a string, return true if it ends in "ly".
17|[nTwice](src/main/java/NTwice.java)|[unit test](src/test/java/NTwiceTest.java)|Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
18|[twoChar](src/main/java/TwoChar.java)|[unit test](src/test/java/TwoCharTest.java)|Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
19|[middleThree](src/main/java/MiddleThree.java)|[unit test](src/test/java/MiddleThreeTest.java)|Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
20|[hasBad](src/main/java/HasBad.java)|[unit test](src/test/java/HasBadTest.java)|Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
21|[atFirst](src/main/java/AtFirst.java)|[unit test](src/test/java/AtFirstTest.java)|Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
<hr/>
<!-- 0|[name](src/main/java)|[unit test](src/test/java)|desc-->

## Tags
- strings

[<<](../README.md#coding-bat)