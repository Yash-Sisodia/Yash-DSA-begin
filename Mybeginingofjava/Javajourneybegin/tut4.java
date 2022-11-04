package Mybeginingofjava.Javajourneybegin;


/* Tutorial 4 -> 
1. Check if the number is prime or not  */

import java.util.*;
public class tut4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;

        for(int i = 2 ; i<n ; i++) {
            if(n%i==0) {
                counter++;
            }
        }
        System.out.println("Counter : "+counter);
        if(counter==0) {
            System.out.println("Prime");
        } 
        else {
            System.out.println("Not Prime");
        }

    }

}

/* Dry Run of the above code  

n = 7 which is prime , lets check if it is prime or not 

i=2,3,4,5,6     ; n%i==0 ,7%2!=0 ,7%3!=0 ,7%4!=0,7%5!=0,7%6!=0    ; counter=0 -> 0,0,0,0,0 
hence 7 is prime!!

n = 18 which is not prime , lets check if it is prime or not

i=2 -> 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17   ; n%i==0 -> 18%2==0,18%3==0,18%4!=0,18%5!=0,18%6==0,18%7!=0,18%8!=0,18%9==0,18%10!=0,18%11!=0,18%12!=0,18%13!=0,18%14!=0,18%15!=0,18%16!=0,18%17!=0  ; counter=0 -> 1,2,3,4 = 4
hence 18 is not prime
*/