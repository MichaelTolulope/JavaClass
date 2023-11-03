package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATMapp {
    public static void main(String[] args) {
        String name = "Mike";
        String pin = "123";

        int balance = 200_000;


       //instance of a scanner class for user inputs
        Scanner inputCredentials = new Scanner(System.in);

        System.out.println("What is your name? ");
        String userName = inputCredentials.nextLine(); // user inputs his/her name and it is stored in a variable
        System.out.println("Input your pin!");
        String pin_input = inputCredentials.nextLine(); // user inputs his/her pin and it is stored in a variable

        //to authenticate the user
         if (userName.equals(name) && pin_input.equals(pin)){

             System.out.println("Welcome "+ userName+".");

             System.out.println("What would you like to do");
             System.out.println("1. Check Balance");
             System.out.println("2. Withdraw");
             System.out.println("3. Transfer funds");
             System.out.println("4. Change pin");
             System.out.println("5. quit");

             Scanner userOptn = new Scanner(System.in);
             int userChoice = userOptn.nextInt();

             if (userChoice == 1){
                 while (true) {
                 System.out.println("First confirm pin");
                 Scanner pin_con = new Scanner(System.in);
                 String pin_confirm = pin_con.nextLine();


                     if (pin.equals(pin_confirm)) {
                         System.out.println("Your balance is " + balance);
                         break;
                     } else {
                         System.out.println("Wrong pin, try again");
                         continue;
                     }
                 }

             }
             else if (userChoice == 2) {
                 System.out.println("How much do you want to withdraw?");
                int withdraw_amnt = new Scanner(System.in).nextInt();
                 System.out.println("First confirm pin");
                 String pin_confirm = new Scanner(System.in).nextLine();

                 if (pin.equals(pin_confirm)) {
                     balance-=withdraw_amnt;
                     System.out.println("Success ... \nYour balance is now " + balance );
                 } else  {
                     System.out.println("Wrong pin, try again");
                 }

             }

         }
         else{
             System.out.println("Incorrect Credential, try again later...");
         }

    }
}
