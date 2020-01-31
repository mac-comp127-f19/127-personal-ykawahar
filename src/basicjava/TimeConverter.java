package basicjava;
import java.util.Scanner;


public class TimeConverter {
    public static int convertToSeconds(int hours, int minutes, int seconds) {
        int totalSecs;
        totalSecs = hours * 3600 + minutes * 60 + seconds;
        return totalSecs;
    }

    public static void main(String[] args) {
        int hrs, mins, secs;
        Scanner scan = new Scanner(System.in);
        System.out.println("Convert time to seconds!");
        System.out.print("Enter hours: ");
        hrs = scan.nextInt();
        System.out.print("Enter minutes: ");
        mins = scan.nextInt();
        System.out.print("Enter seconds: ");
        secs = scan.nextInt();
        System.out.println("That is equal to " + convertToSeconds(hrs, mins, secs) + " seconds!");
    }
}

