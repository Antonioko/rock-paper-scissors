package com.company;
import java.util.Scanner;
public class Main {
    public static int numPlayerWin=0;
    public static int numTie=0;
    public static int numComputerWin=0;
    public static String getComputerChoice() {

        int min = 0;
        int max = 2;
        double computerChoice = Math.floor(Math.random() * (max - min + 1) + min);
        String computerOutput = "";
        switch ((int) computerChoice) {
            case 0:
                computerOutput = "rock";
                break;
            case 1:
                computerOutput = "paper";
                break;
            case 2:
                computerOutput = "scissors";
                break;
            default:
                System.err.println("your computer is crusty");
                break;

        }
        return computerOutput;
    }

    public static void playGame(String playerInput) {
        boolean everythingWentFine = true;
        String computerChoice = getComputerChoice();
        String playerChoice = playerInput;

        switch (computerChoice) {
            case ("rock"):
                switch (playerChoice) {
                    case ("rock"):
                        System.out.println("Tie!");
                        numTie++;
                        break;
                    case ("paper"):
                        System.out.println("player wins!");
                        numPlayerWin++;
                        break;
                    case ("scissors"):
                        System.out.println("computer wins!");
                        numComputerWin++;
                        break;
                    default:
                        System.err.println("error:invalid input!");
                        everythingWentFine = false;
                        break;
                }
                break;
            case ("paper"):
                switch (playerChoice) {
                    case ("rock"):
                        System.out.println("computer wins!");
                        numComputerWin++;
                        break;
                    case ("paper"):
                        System.out.println("tie!");
                        numTie++;
                        break;
                    case ("scissors"):
                        System.out.println("player wins!");
                        numPlayerWin++;
                        break;
                    default:
                        System.err.println("error:invalid input!");
                        everythingWentFine = false;
                        break;
                }
                break;
            case ("scissors"):
                switch (playerChoice) {
                    case ("rock"):
                        System.out.println("player wins!");
                        numPlayerWin++;
                        break;
                    case ("paper"):
                        System.out.println("computer wins!");
                        numComputerWin++;
                        break;
                    case ("scissors"):
                        System.out.println("tie!");
                        numTie++;
                        break;
                    default:
                        System.err.println("error:invalid input!");
                        everythingWentFine = false;
                        break;
                }
                break;
            default:
                System.err.println("error:u have a terribly crusty bobasti computer");
                everythingWentFine = false;
                break;

        }
        System.out.println("player: " + playerChoice + ", computer: " + computerChoice);
        if(everythingWentFine) {
            System.out.println("Times player won: " + numPlayerWin);
            System.out.println("times computer won: " + numComputerWin);
            System.out.println("number of ties: " + numTie);
        }
    }

    public static void main(String[] args) {

       Scanner myScanner = new Scanner(System.in);
       for(int i = 0; i<100; i++){
           boolean exit = false;
           System.out.println("Please enter rock, paper or scissors.");
           String playerInput = myScanner.nextLine();
           playGame(playerInput);

       }
       System.out.println("Geez, take a pause, drink some water, Stop playing this simple game!");

    }
}
