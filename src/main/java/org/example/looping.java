package org.example;

import java.util.Scanner;

public class looping{
    public void multiplication_table_2(){
        int x = 1;
        while (x<=5){
            System.out.println("2 *"+" "+x+" = "+2*x);
            x++;
        }

    }
    public void multiplication_table_3(){
        int x = 1;
        while (x<=5){
            System.out.println("2 *"+" "+x+" = "+2*x);
            x++;
        }

    }
    public void multiplication_table_4(){
        int x = 1;
        while (x<=5){
            System.out.println("2 *"+" "+x+" = "+2*x);
            x++;
        }

    }
    public void multiplication_table_5(){
        int x = 1;
        while (x<=5){
            System.out.println("2 *"+" "+x+" = "+2*x);
            x++;
        }

    }
    public void something() {
        multiplication_table_5();
    }

    public static void main(String[] args) {
while(true) {
    int choice;
    do {
        System.out.println("choose from the menu");
        System.out.println("------------1. continue");
        System.out.println("------------2.New game");
        choice = new Scanner(System.in).nextInt();
    } while (choice != 1 && choice !=2);
    if (choice == 1){

        break;
    } else if (choice == 2) {
        System.out.println("Starting a new game....");
        break;
    }
}
    }






    }



