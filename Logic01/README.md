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
<hr/>
<!-- 0|[name](src/main/java)|[unit test](src/test/java)|desc-->

## Tags
- boolean, conditionals

[<<](../README.md#coding-bat)
