package Mybeginingofjava.Javajourneybegin;


/* Print the greeting if 
             User press red button (1) -> Hello
             User press green button (2) -> Namaste
             User press blue button (3) -> Bonjour

             by if else conditional statements 
 */

// import java.util.*;
// public class tut2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         if(button==1) {
//             System.out.println("Hello");
//         }
//         else if(button==2) {
//             System.out.println("Namaste");
//         }
//         else if(button==3) {
//             System.out.println("Bonjour");
//         }
//         else {
//             System.out.println("Invalid Input");
//         }
//     }
// }


// Switch Concept
/* Print the greeting by switch case  */

import java.util.*;
public class tut2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1 : System.out.println("Hello");
                     break;
            case 2 : System.out.println("Namaste");
                     break;
            case 3 : System.out.println("Bonjour");
                     break;
            default: System.out.println("Invalid Input");
        }
    }
}
