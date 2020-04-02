package activityStarterCode.objects;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Die die1 = new Die();
        String resultString;
        for (int i = 1; i < 11; i++) {
            die1.roll();
            resultString = die1.toString();
            System.out.println("Roll " + i + " generated a " + resultString);
        }

        Die die2 = new Die();
        int count = 0;

        for (int i = 0; i < 1000000; i++) {
            die1.roll();
            die2.roll();
            if (die1.getFaceValue() == (die2.getFaceValue())) {
                count ++;
            }
        }
        System.out.println("In 1,000,000 rolls, two dice agreed " + count + " times");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the max face of the die: ");
        int n = scan.nextInt();
        Die die3 = new Die(n);
        die3.roll();
        resultString = die3.toString();
        System.out.println("The " + n + " sided die rolled a " + resultString);
    }
}
