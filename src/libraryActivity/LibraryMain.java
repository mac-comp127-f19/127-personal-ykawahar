/**
 * A class to run an interactive library program.
 *
 * @author Abby Marsh Fall 2019
 */
package libraryActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryMain {

    /**
     * Helper method to check an item out from the library
     * once you have implemented Media, change this to accept any Media type!
     *
     * @param title title of item to check out
     * @param library list of library items
     * @return true if item checked out successfully, false otherwise
     */
    public static boolean checkOut(String title, List<Media> library) {
        for(Media media : library) {
            if(media.getTitle().equalsIgnoreCase(title)) {
                return media.checkOut();
            }
        }

        return false;
    }

    /**
     * Helper method to check an item in to the library
     * once you have implemented Media, change this to accept any Media type!
     *
     * @param title title of item to check in
     * @param library list of library items
     * @return true if item checked in successfully, false otherwise
     */
    public static boolean checkIn(String title, List<Media> library) {
        for(Media media : library) {
            if(media.getTitle().equalsIgnoreCase(title)) {
                return media.checkIn();
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // create/populate library
        // make this a list of Media objects, once your interface has been completed
        List<Media> library = new ArrayList<>();

        library.add(new Book("American Gods", "Neil Gaiman"));
        library.add(new Book("The Yiddish Policeman's Union", "Michael Chabon"));
        library.add(new Book("Pond", "Claire-Louise Bennett"));
        library.add(new Book("The Dream Songs", "John Berryman"));
        library.add(new Book("The Dud Avocado", "Elaine Dundy"));

        // add Video objects to your library, once the class has been created
        library.add(new Video("Iron Man", "Jon Favreau", 2));
        library.add(new Video("Titanic", "James Cameron", 2));
        library.add(new Video("Toy Story", "John Lasseter", 3));

        // If you create additional Media classes, add those items too!


        // begin user prompts
        System.out.println("Enter a command to perform an action. Type \'help\' to see the list of commands, and \'quit\' to exit.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while(!input.equalsIgnoreCase("quit")) { // quit to exit

            if(input.equalsIgnoreCase("help")) { // print list of commands
                System.out.println("The following commands are accepted:");
                System.out.println("\'list\': list all library items and whether they are available");
                System.out.println("\'checkout [title]\': checkout the item called [title]");
                System.out.println("\'checkin [title]\': checkin the item called [title]");
                System.out.println("\'quit\': exit the program");

            } else if (input.matches("checkout .+")) { // checking out an item
                if (checkOut(input.substring(9), library)) {
                    System.out.println("Checked out " + input.substring(9));
                } else {
                    System.out.println("Could not check out that title.");
                }

            } else if (input.matches("checkin .+")) { // checking in an item
                if(checkIn(input.substring(8), library)) {
                    System.out.println("Checked in " + input.substring(8));
                } else {
                    System.out.println("Could not check in that title.");
                }


            } else if (input.equalsIgnoreCase("list")) { // list all library items
                System.out.println("\n-----\nLibrary Inventory\n-----\n");

                // edit this to work for all Media items
                for(Media media : library) {
                    System.out.println(media.toString());
                }

            } else { // invalid command
                System.out.println("Enter a valid command");
            }

            System.out.println("\nEnter a command to perform an action. Type \'help\' to see the list of commands");
            input = sc.nextLine();
        }


    }
}
