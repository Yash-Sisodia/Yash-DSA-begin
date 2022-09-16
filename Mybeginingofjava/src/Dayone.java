//Check whether the number is Prime or Not?

import java.util.*;
public class Dayone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;

        for(int i = 2 ; i<n ; i++) {
            if(n%i==0) {
                counter++;
                System.out.println(counter);
            }
        }
        if(counter==0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }


    }
    
}
