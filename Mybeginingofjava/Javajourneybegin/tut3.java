package Mybeginingofjava.Javajourneybegin;



// Loops in Java -> For Loop ,While Loop and Do-While Loop

//FOR LOOP 

// Example-1 Print hello world 10 times by for loop 

// import java.util.*;
// public class tut3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for(int i = 1 ; i<=n ; i++) {
//             System.out.println("Hello World : " +i);
//         }
//         System.out.println("Done : printed ");
//     }
    
// }


// Example-2 Print the number 0 to 10 

// import java.util.*;
// public class tut3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 0 ; i<=n ; i++) {
//             System.out.println(i);
//         }
//     }
// }

// WHILE LOOP 

// Print counting 1 to 9 by while loop ?

// Example-3

// import java.util.*;
// public class tut3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i = 1;

//         while(i<=9) {
//             System.out.println(i);
//             i++;
//         }
//         System.out.println("Done");
//     }
// }


//  DO WHILE LOOP 

// Print counting 1 to 9 by do while loop 

// import java.util.*;
// public class tut3 {
//     public static void main(String[] args ) {
//         Scanner sc = new Scanner(System.in);
//         int i = 1;

//         do {
//             System.out.println(i);
//             i++;
//         } while(i<10);
//     }
// }


// TEST BETWEEN WHILE OR DO WHILE LOOP

// while loop code here ->

// import java.util.*;
// public class tut3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int i = 12;

//         while(i<11) {
//             System.out.println("Yash Sisodia");
//         }
//     }
// }


// Do-While loop code here  

// import java.util.*;
// public class tut3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i = 12;

//         do {
//             System.out.println("Yash Sisodia");
//         } while(i<11);
//     }
// }

// Example-4 Print the sum of first n natural numbner 
/* Like 1+2+3+4+5 */

// import java.util.*;
// public class tut3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;

//         for(int i = 1 ; i <=n ; i++) {   // i=0 0<=5 sum = 0+0=0 , i=1 1<=5 sum=0+1=1 , i=2 2<=5 sum=1+2 = 3
//             sum = sum+i;
//         }
//         System.out.println(sum);
//     }
// }

// Example-5 Print the table of a number input by the user

import java.util.*;
public class tut3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        for(int i = 1 ; i <= 10 ; i++) {
            int prd = n * i;
            System.out.println(n+ " * " +i+ " = " +prd);
        }
        
    }
}