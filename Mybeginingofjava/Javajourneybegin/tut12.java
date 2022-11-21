package Mybeginingofjava.Javajourneybegin;

/* 

Rotate A Number
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340

Input Format
"n" where n is any integer.
"K" where k is any integer.

Output Format
"r", the rotated number

Constraints
1 <= n < 10^9
-10^9 < k < 10^9

Sample Input
562984
2

Sample Output
845629

 */

import java.util.*;
public class tut12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input number 27391
        int k = sc.nextInt(); // Number of times 2
        
        // First calculate number of digits in a number 
        int counter = 0; //5
        int a = 0;
        int b = a;
        while(n!=0) {
            a = n % 10;
            counter++;
            n=n/10;
        }
        int mul = counter - k; // utne number aagye jitne hume multiply krne hai 5-2=3
        int newmul = b * (int) Math.pow(10,mul); //91000
        System.out.println(newmul); 


    }
}

