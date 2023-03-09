package chapter8;

import java.util.Scanner;

// TODO: 3/5/23  - to complete reset password validator
public class PasswordValidator {

    private String username;
    private String password;

    public PasswordValidator(String username, String password){
        this.username = username;
        this.password = password;
    }

    private static Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args){
        var validator = userCredentials();
        validator.printPasswordRules();
    }

    public static PasswordValidator userCredentials(){
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        return new PasswordValidator(username, password);
    }

    public void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }


    public String getNewPassword(){
        System.out.println("Enter your new password: ");
        return scanner.nextLine();
    }

}
