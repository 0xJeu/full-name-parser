package com.plurasight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your full nameParts (first, middle, last): ");
        String fullName = keyboard.nextLine().trim();

        String [] nameParts = fullName.split(" ");
        String firstName = "(none)";
        String middleName = "(none)";
        String lastName = "(none)";

        if (nameParts.length > 0){
            firstName = nameParts[0];
        }
        if (nameParts.length == 2) {
            lastName = nameParts[1];
        }
        if (nameParts.length > 2) {
            middleName = nameParts[1];
            lastName = nameParts[2];
        }

//        if (!firstName.isEmpty() || !middleName.isEmpty() || !lastName.isEmpty()){
//            System.out.println("Test complete");
//            System.out.println(firstName);
//            System.out.println(middleName);
//            System.out.println(lastName);
//        } else {
//            System.out.println("Test Fail");
//        }

        System.out.printf("""
                First name: %s
                Middle name: %s
                Last name: %s""", firstName, middleName, lastName);

    }
}
