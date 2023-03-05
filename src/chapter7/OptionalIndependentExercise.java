package chapter7;

import java.util.Scanner;

public class OptionalIndependentExercise {

    public static void main(String[] args){
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to retrieve day of the week:");
        int userInput = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= daysOfWeek.length; i++) {
            if (i == userInput) {
                System.out.println(daysOfWeek[i-1]);
                break;
            }

        }
    }
}
