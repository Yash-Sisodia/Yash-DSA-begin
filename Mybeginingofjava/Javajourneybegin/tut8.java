package Mybeginingofjava.Javajourneybegin;

/* 
Count Digits In A Number
1. You've to count the number of digits in a number.
2. Take as input "n", the number for which the digits has to be counted.
3. Print the digits in that number.

Input Format
"n" where n is any integer.

Output Format
"d" where d is the number of digits in the number "n"

Constraints
1 <= n < 10^9

Sample Input
65784383

Sample Output
8
 */


import java.util.*;
public class tut8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;

        while(n>0) {
            int mod = n%10;  // 65784383 % 10 = 3
            counter = counter +1;
            n=n/10;
        }
        System.out.println(counter);

    }
    
}

// All test cases passed :) 
