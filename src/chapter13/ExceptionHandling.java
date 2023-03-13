package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String args[]){

        // createNewFile();
        numbersExceptionHandling();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

// CreateNewFile Method with rethrow
    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }


    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }finally{
            fileReader.close();
        }
    }

        /*Once we have the resource declared at this level, we no longer need the finally{} clause to close the resource.
        Try with resources allows you to specify a resource and Java will automatically close this resource on your behalf once done with the try/catch.
         */
    public static void tryWithResources(){
        File file = new File("resources/numbers.txt");
        try(Scanner fileReader = new Scanner(file)){
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }
    }
}
