package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args){

        int[] ticket = generateNumber();
        Arrays.sort(ticket);
        printLuckyNumbers(ticket);
    }

    public static int[] generateNumber(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++){
            int randomNumber;

            /*
            Generate random number then search to make sure it doesn't
            already exist in the array. If it does, regenerate and search again.
            */
            do{
               randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket, randomNumber));
            // Number is unique if we get here. Add number to an array
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){
        for (int value : array) {
            if(value == numberToSearchFor){
                return true;
            }
        }
        return false;
    }

    public static void printLuckyNumbers(int ticket[]){
//        int counter = 0;
        for (int number:ticket
             ) {
//            counter +=1;
//            System.out.println(counter + ") "+ number);
            System.out.print(number + " | ");
        }
    }


    public static boolean binarySearch(int[] array, int numberToSearchFor){

        //Array must be sorted first
        Arrays.sort(array);
        Arrays.binarySearch(array, numberToSearchFor);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0){
            return true;
        }
        else return false;
    }
}
