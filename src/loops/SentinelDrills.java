package loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SentinelDrills {
    public static boolean isOdd(int x) {
        return x % 2 != 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a value ... ");
        int input = scan.nextInt();
        while (input >= 0) {
            boolean result = isOdd(input);
            if (result) {
                System.out.println("That is odd");
            } else {
                System.out.println("That is even");
            }
            if (result) {
                System.out.println("Wow, that's odd!");
            }
            System.out.print("Enter another value ... ");
            input = scan.nextInt();
        }
        System.out.println("Goodbye!");



        System.out.print("Enter an integer: ");
        int number = scan.nextInt();
        int count = 0, quotient = number;
        while (quotient >= 1) {
            quotient = quotient / 2;
            count += 1;
        }
        System.out.println(number + " can be divided by 2 for " + (count - 1) + " times until reaching 1." );
    }

}
