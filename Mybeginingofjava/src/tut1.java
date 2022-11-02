// 1 November 2022 Java Begin Tutorial 1 :)

// Conditional statments examples

/*  
Check age if age is greater than 18 than print Adult else Not Adult ?
import java.util.*;
public class tut1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

    }
}
 
*/


//Check if the number is even or odd ?

import java.util.*;
public class tut1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
    
}

