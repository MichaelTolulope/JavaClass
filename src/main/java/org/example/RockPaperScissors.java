package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Welcome to a game of Rock, Paper, Scissors!");
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name");
        String name = input.nextLine();


        System.out.println("Are you ready "+name);
        int score=0;
        int comp_score=0;
        while(true) {


            System.out.println("Choose a number");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Quit");

            //user's choice
            int choice = input.nextInt();

            //now the computer's choice

            int computerChoice = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            if (computerChoice == choice) {
                if (computerChoice == 1 && choice == 1) {
                    System.out.println("You both chose Rock");
                } else if (computerChoice == 2 && choice == 2) {
                    System.out.println("You both chose Paper");
                } else if (computerChoice == 3 && choice == 3) {
                    System.out.println("You both chose Scissors");

                }
                System.out.println("Tie!");

                System.out.println("Your score: "+score);
                System.out.println("Computers score: "+comp_score);
            } else if (computerChoice == 1 && choice == 2) {
                System.out.println("computer : i choose Rock");
                System.out.println("you loose!");
                System.out.println();
                score ++;
                System.out.println("Your score: "+score);
                System.out.println("Computers score: "+comp_score);
                continue;
            } else if (computerChoice == 1 && choice == 3) {
                System.out.println("computer : i choose Rock");
                System.out.println("You loose!");
                comp_score++;
                System.out.println("Your score: "+score);
                System.out.println("Computers score: "+comp_score);
                continue;
            } else if (computerChoice == 2 && choice == 1) {
                System.out.println("computer : i choose Paper");
                System.out.println("You loose!");
                comp_score ++;
                System.out.println("Your score: "+score);
                System.out.println("Computers score: "+comp_score);
                continue;

            } else if (computerChoice == 2 && choice == 3) {
                System.out.println("computer : i choose Paper");
                System.out.println("You win!");
                score++;
                System.out.println("Your score: "+score);
                System.out.println("Computers score: "+comp_score);
                continue;

            } else if (computerChoice == 3 && choice == 1) {
                System.out.println("computer : i choose Scissors");
                System.out.println("You win!");
                score++;
                System.out.println("Your score: "+score);
                System.out.println("Computers score: "+comp_score);
                continue;

            } else if (computerChoice == 3 && choice == 2) {
                System.out.println("computer : i choose Scissors");
                System.out.println("You loose!");
                comp_score ++;
                System.out.println("Your score: "+score);
                System.out.println("Computers score: "+comp_score);
                continue;

            } else if (choice ==4) {
                System.out.println("Your score: "+score);
                System.out.println("Computers score: "+comp_score);
                if(comp_score < score){
                    System.out.println("You won the game 😁 !!!");
                }else if(comp_score > score){
                    System.out.println("You lost the game 😢");
                }
                else{
                    System.out.println("It's a Tie ");
                    System.out.println("So continue ... 😒😂");
                    continue;
                }
                break;

            } else {
                System.out.println("invalid option!");
            }
        }

    }
}
