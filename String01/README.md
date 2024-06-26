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
22|[lastChars](src/main/java/LastChars.java)|[unit test](src/test/java/LastCharsTest.java)|Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
23|[conCat](src/main/java/ConCat.java)|[unit test](src/test/java/ConCatTest.java)|Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
24|[lastTwo](src/main/java/LastTwo.java)|[unit test](src/test/java/LastTwoTest.java)|Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
25|[seeColor](src/main/java/SeeColor.java)|[unit test](src/test/java/SeeColorTest.java)|Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
26|[frontAgain](src/main/java/FrontAgain.java)|[unit test](src/test/java/FrontAgainTest.java)|Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
27|[minCat](src/main/java/MinCat.java)|[unit test](src/test/java/MinCatTest.java)|Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
28|[extraFront](src/main/java/ExtraFront.java)|[unit test](src/test/java/ExtraFrontTest.java)|Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
29|[without2](src/main/java/Without2.java)|[unit test](src/test/java/Without2Test.java)|Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
30|[deFront](src/main/java/DeFront.java)|[unit test](src/test/java/DeFrontTest.java)|Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
31|[startWord](src/main/java/StartWord.java)|[unit test](src/test/java/StartWordTest.java)|Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
32|[withoutX](src/main/java/WithoutX.java)|[unit test](src/test/java/WithoutXTest.java)|Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
33|[withoutX2](src/main/java/WithoutX2.java)|[unit test](src/test/java/WithoutX2Test.java)|Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
<hr/>
<!-- 0|[name](src/main/java)|[unit test](src/test/java)|desc-->

## Tags
- strings

[<<](../README.md#coding-bat)