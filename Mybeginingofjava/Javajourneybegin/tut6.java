package Mybeginingofjava.Javajourneybegin;


/* Print All Primes Till N
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).

Input Format
low 
high

Output Format
n1
n2
.. all primes between low and high (both included)

Constraints
2 <= low < high < 10 ^ 6

Sample Input
6 
24

Sample Output
7
11
13
17
19
23

 */

import java.util.*;
// public class tut6 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int low = sc.nextInt();
//         int high = sc.nextInt();

//         for(int i = low ; i <= high ; i++) {
//             int counter = 0;
//             for(int j = 2 ; j<low ; j++) {
//                 if(i%j==0) {
//                     counter++;
//                     break;
//                 }
//             }
//             if(counter == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
    
// }

/* 
Dry run of above code 
low = 6
high = 24

i=low->6  ; i<=high-> 6<=24     ;counter=0->0     ;j=2-> 2   ;j*j<=low->4<=6    ; if(i%j==0) ->6%2==0
 */

 // iss wale code se 3/5 test cases he pass ho paaye iska mtlb ye h ki humeare code m proeblem h 😐\


 // optimized code 

import java.util.*;
public class tut6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low ; i <= high ; i++) {
            int counter = 0;
            for(int j = 2 ; j*j<=i ; j++) {
                if(i%j==0) {
                    counter++;
                    break;
                }
            }
            if(counter == 0) {
                System.out.println(i);
            }
        }
    }
    
}

// Correct Output from this code 
