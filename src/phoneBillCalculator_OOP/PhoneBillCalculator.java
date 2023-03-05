package phoneBillCalculator_OOP;

import java.util.Scanner;

public class PhoneBillCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("Type a bill id: ");
        int billId = scanner.nextInt();

        System.out.println("Type a base cost of plan:");
        double baseCoast = scanner.nextDouble();

        System.out.println("Type number of allotted minutes: ");
        int allottedMinutes = scanner.nextInt();

        System.out.println("Type number of minutes used: ");
        int usedMinutes = scanner.nextInt();

        scanner.close();
        PhoneBill phoneBill = new PhoneBill(billId, baseCoast, allottedMinutes, usedMinutes);

        phoneBill.printItemizedBill();
    }
}
