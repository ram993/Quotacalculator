package Quotacalculator;

import java.util.Scanner;

public class Quota {
    public static void main(String args[]) {
        int quota = 10;

        System.out.println("Enter the number of quota achieved?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota)
            System.out.println("Congrats! you have achieved the Quota");
        else {
            int salesshort = quota - sales;
            System.out.println("The quota was shot by" + salesshort + "salesshort");

        }
    }
}
