# CodingBat - Logic-1

## Description
basic boolean logic puzzles -- if else && || !

## Problems
number|solution|test|description
:-:|:-:|:-:|:--
1|[cigarParty](src/main/java/CigarParty.java)|[unit test](src/test/java/CigarPartyTest.java)|When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
2|[dateFashion](src/main/java/DateFashion.java)|[unit test](src/test/java/DateFashionTest.java)|You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
3|[squirrelPlay](src/main/java/SquirrelPlay.java)|[unit test](src/test/java/SquirrelPlayTest.java)|The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
4|[caughtSpeeding](src/main/java/CaughtSpeeding.java)|[unit test](src/test/java/CaughtSpeedingTest.java)|You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
5|[sortaSum](src/main/java/SortaSum.java)|[unit test](src/test/java/SortaSumTest.java)|Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
6|[alarmClock](src/main/java/AlarmClock.java)|[unit test](src/test/java/AlarmClockTest.java)|Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
7|[love6](src/main/java/Love6.java)|[unit test](src/test/java/Love6Test.java)|The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
8|[in1To10](src/main/java/In1To10.java)|[unit test](src/test/java/In1To10Test.java)|Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
9|[specialEleven](src/main/java/SpecialEleven.java)|[unit test](src/test/java/SpecialElevenTest.java)|We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special.
10|[more20](src/main/java/More20.java)|[unit test](src/test/java/More20Test.java)|Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
11|[old35](src/main/java/Old35.java)|[unit test](src/test/java/Old35Test.java)|Return true if the given non-negative number is a multiple of 3 or 5, but not both.
12|[less20](src/main/java/Less20.java)|[unit test](src/test/java/Less20Test.java)|Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.
13|[nearTen](src/main/java/NearTen.java)|[unit test](src/test/java/NearTenTest.java)|Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
14|[teenSum](src/main/java/TeenSum.java)|[unit test](src/test/java/TeenSumTest.java)|Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
15|[answerCell](src/main/java/AnswerCell.java)|[unit test](src/test/java/AnswerCellTest.java)|Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
16|[teaParty](src/main/java/TeaParty.java)|[unit test](src/test/java/TeaPartyTest.java)|We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
17|[fizzString](src/main/java/FizzString.java)|[unit test](src/test/java/FizzStringTest.java)|Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
18|[fizzString2](src/main/java/FizzString2.java)|[unit test](src/test/java/FizzString2Test.java)|Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?
19|[twoAsOne](src/main/java/TwoAsOne.java)|[unit test](src/test/java/TwoAsOneTest.java)|Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
20|[inOrder](src/main/java/InOrder.java)|[unit test](src/test/java/InOrderTest.java)|Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.
21|[inOrderEqual](src/main/java/InOrderEqual.java)|[unit test](src/test/java/InOrderEqualTest.java)|Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
<hr/>
<!-- 0|[name](src/main/java)|[unit test](src/test/java)|desc-->

## Tags
- boolean, conditionals

[<<](../README.md#coding-bat)
