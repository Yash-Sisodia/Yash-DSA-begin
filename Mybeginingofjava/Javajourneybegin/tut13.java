package Mybeginingofjava.Javajourneybegin;

/* 

Functions and Methods in Java 

Function -> ekk block of code hota hai jo kuch input leta kuch processing krta hai or kuch output produce krta hai 

Syntax of Function in Java

returntype functionName(type arg1 , type arg2 ...) {
    // operations
}

 */
 
// Example for understanding function 
// Print a given name in a function

import java.util.*;
public class tut13 {

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
    }
}
