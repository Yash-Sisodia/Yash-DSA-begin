package Mybeginingofjava.Javajourneybegin;

/* Conditional Statments Examples  */

/* 1. Take input from the user and check if the entered age is considered in Adult or not ? */

import java.util.*;
public class tut1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>18) {
            System.out.println("Adult");
        } 
        else {
            System.out.println("Not Adult");
        }
    }
}

/* 2. Check if the entered number is odd or even ? */

// import java.util.*;
// public class tut1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n%2==0) {
//             System.out.println("Even");
//         }
//         else {
//             System.out.println("Odd");
//         }
//     }
// }

/* 3. Take two inputs from the user and specify whether the entered number is greater , smaller or equal */

// import java.util.*;
// public class tut1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a==b) {
//             System.out.println("Equal");
//         }
//         else if(a>b) {
//             System.out.println("a is greater than b");
//         }
//         else {
//             System.out.println("a is lesser than b");
//         }
//     }
// }
