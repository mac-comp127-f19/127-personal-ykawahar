package basicjava;
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What size pyramid should I draw? ");
        int layers = scan.nextInt();
        int maxLayer = layers * 2 + 1 ;

        for (int i = 0; i < layers; i++) {
            for (int k = 0; k < (maxLayer - (i * 2 + 1)) / 2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("∆");
            }
            System.out.println();
        }
    }
}
