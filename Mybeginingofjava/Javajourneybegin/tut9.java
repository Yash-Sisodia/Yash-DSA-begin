package Mybeginingofjava.Javajourneybegin;

/* 
Digits Of A Number

1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.

Input Format
"n" where n is any integer.

Output Format
d1
d2
d3
... digits of the number

Constraints
1 <= n < 10^9

Sample Input
65784383

Sample Output
6
5
7
8
4
3
8
3

*/

// First we have to find number of digits in a number so that we can divide the whole number by number of digits.
import java.util.*;
public class tut9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 754
        // First calculate number of digits in a given number 
        int counter = 0; //3
        int ori = n;

        while(n>0) {
            int a = n%10;
            counter++;
            n=n/10;
        }
       // Yha tk humare number of digits calculate hogye -> ki number m kitne digits hai

        int div = (int) Math.pow(10,counter-1);  //100

        while(ori!=0) {
            int no = ori/div; //7
            System.out.println(no); //7
            ori = ori%div; //54
            div = div/10;
        }
     }
}
