// How to work with String & Integer simultaneously

import java.util.*;
public class IntwithString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = sc.nextLine();

        System.out.println("Dear "+ name + " Here is the counting");
        for(int i = 1 ; i<=n ; i++) {
            System.out.println(i);
        }
    }
}
