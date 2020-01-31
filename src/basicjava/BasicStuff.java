package basicjava;

public class BasicStuff {
    public static void main(String[] args){
        double age0 = 19, age1 = 19;
        System.out.println("We are " + age0 + " and " + age1 + " years old");

        double sumOfAges = age0 + age1;
        System.out.println("The sum of our ages is " + sumOfAges + "!");
        // println prints in newline
        System.out.println("The sum of our ages is " + (age0 + age1) + "!");

        System.out.println(6/3);
        System.out.println(6.0/4.0);
        System.out.println((double)6/4);

        System.out.println(Integer.MAX_VALUE);
        // Max INT value is 2^31
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Integer Min value - 1 = " + (Integer.MIN_VALUE - 1));

        System.out.println(Long.MAX_VALUE);


        //Write code to compute the number of weeks, days, and hours in 1600 hours.
        int totalHours = 1600, weeks = totalHours/24/7, days = totalHours/24%7, hours = totalHours%24;
        System.out.println("There are " + weeks + " weeks, " + days + " days, " + hours + " hours in " + totalHours + " hours." );

        //Write code for a program that computes the surface area and volume of a solid cone given the radius of its base and height.
        double h = 5, r = 2 ,
                v = 1/3f * Math.PI * Math.pow(r,2) * h,
                a = Math.PI * Math.pow(r,2) + Math.PI * r * Math.sqrt(Math.pow(r,2) + Math.pow(h,2));
        System.out.println("Volume = " + v + " ");
        System.out.print("Surface Area = " + a);




    }
}

