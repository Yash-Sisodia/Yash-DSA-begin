package Mybeginingofjava.Javajourneybegin;

/* 2. Is A Number Prime
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

Input Format               
A number t
A number n
A number n
.. t number of times

Output Format
prime
not prime
not prime
.. t number of times

Sample Input
5
13
2
3
4
5

Sample Output
prime
prime
prime
not prime
prime

 */

// import java.util.*;
// public class tut5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt(); // t -> number kitne h 

//         for(int i = 1 ; i<=t ; i++) {
//             int n = sc.nextInt();
//             int counter=0;
//             for(int j = 2 ; j<n ; j++) {
//                 if(n%j==0) {
//                     counter++;
//                 }
//             }
//             if(counter==0) {
//             System.out.println("prime");
//             }
//             else {
//                 System.out.println("not prime");
//             }
//         }

//     }
    
// }

/* This code is absolutely correct but the major problem with this code is its time complexity is lil bit high 
How much time this code is taking 10^4(outer Loop) * 10^9(Inner Loop) = 10^13 which is greater than 10^9 
 */

/* Now the question come how to optimized this code iski time complexity km kese kre?
lets take an example of 24 
calculate factors of 24
1*24 24*1
2*12 12*2
3*8  8*4
4*6  6*4 

you can see after 4*6 factors are repeating which means if we can check till root our problem will be sorted (till 4*6)

 */

// Optimized Code 
import java.util.*;
public class tut5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // t -> number kitne h 

        for(int i = 1 ; i<=t ; i++) {
            int n = sc.nextInt();
            int counter=0;
            for(int j = 2 ; j*j<=n ; j++) {
                if(n%j==0) {
                    counter++;
                }
            }
            if(counter==0) {
            System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }

    }
    
}