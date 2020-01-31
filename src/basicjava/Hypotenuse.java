package basicjava;
import java.util.Scanner;

public class Hypotenuse {

    public static double calculateHypotenuse(double length1, double length2) {
        double hypotenuse;
        hypotenuse = Math.sqrt(length1 * length1 + length2 * length2);
        return hypotenuse;
    }

    public static void main(String[] args) {
        double l1, l2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        l1 = scan.nextDouble();
        System.out.print("Enter the length of side 2: ");
        l2 = scan.nextDouble();
        System.out.println(calculateHypotenuse(l1,l2));
    }
}




