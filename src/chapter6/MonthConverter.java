package chapter6;

import java.util.Scanner;

public class MonthConverter {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Type a number between 1 and 12: ");
        int inputMonthNumber = scanner.nextInt();

        System.out.println("Type a month between January and December: ");
        String inputMonth = scanner.next();

        scanner.close();

        System.out.println(Month.getMonth(inputMonthNumber));
        System.out.println(Month.getMonth(inputMonth));

    }
}
