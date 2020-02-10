package basicjava;

public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0, count = 2;
        for (int i = 0; i < 10; i++) {
            sum = sum + 1 / count;
            count ++;
        }
        System.out.println("Sum of 1/2 + 1/3 + ... 1/10 = " + sum);

        double sum2 = 0, count2 = 2;
        int counter = 0;
        while (sum2 < 2) {
            sum2 = sum2 + 1 / count2;
            count2 ++;
            counter ++;
        }
        System.out.println("It takes " + counter + " factors until the sum is greater than 2 (last factor is " + "1/" + (int)count2 + ")."  );

    }
}
