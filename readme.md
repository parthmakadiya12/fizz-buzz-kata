## Fizz Buz com.fizzbuzz.Game

- Write a short program that prints each number from 1 to 100 on a new line. 
    - For each multiple of 3, print "Fizz" instead of the number. 
    - For each multiple of 5, print "Buzz" instead of the number. 
    - For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.

For example :
```
1 - 1
2 - 2
3 - Fizz
4 - 4
5 - Buzz
6 - Fizz
7 - 7
8 - 8
9 - Fizz
10 - Buzz
11 - 11
12 - Fizz
13 - 13
14 - 14
15 - FizzBuzz
```
- We used arrayList
- However we could have just took the string and do it. See below
```
 for (int i = 1; i < 100; i++) {
     String output = "";
     if (i % 3 == 0) output += "Fizz";
     if (i % 5 == 0) output += "Buzz";
     
     System.out.println(output.isEmpty() ? i : output);
  }
```


References:
- https://codingdojo.org/kata/FizzBuzz/