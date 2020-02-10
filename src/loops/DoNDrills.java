package loops;

import javax.swing.*;

public class DoNDrills {
    public static void main(String[] args) {
        // Print 0~9
        for (int i = 0; i < 10; i++)
            System.out.println(i);
        System.out.println();

        //Print 10~0
        for (int i = 10; i >= 0; i--)
            System.out.println(i);
        System.out.println();

        //Print 1 and keep multiplying by 2 nine times
        int a = 1;
        for (int i = 1; i < 9; i++) {
            System.out.println(a);
            a = a+a;
        }
        System.out.println();

        // Print 2x+1 from 0 nine times
        int b = 0;
        for (int i = 0; i < 9; i++) {
            System.out.println(b);
            b = 2*b + 1;
        }
        System.out.println();

        // Print the square root of the first 25 odd numbers
        int oddNum = 1;
        for (int i = 0; i < 25 ; i++) {
            System.out.println("The square root of " + oddNum + " is " + Math.sqrt(oddNum));
            oddNum +=2;
        }
        System.out.println();
    }
}
