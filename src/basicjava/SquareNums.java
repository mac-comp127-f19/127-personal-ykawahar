package basicjava;
import java.util.Scanner;

public class SquareNums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Prints the square of the entered number. Stops if that square is divisible by 4.");
        int input, power;
        do {
            System.out.print("Enter a number ... ");
            input = scan.nextInt();
            power = input * input;
            System.out.println(power);
        } while (power % 4 != 0);
        System.out.println("Divisible by 4.");
    }
}
