package com.company;
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
                computerOutput = "error";
                break;

        }
        return computerOutput;
    }

    public static void playGame(String playerInput) {
        String computerChoice = getComputerChoice();
        String playerChoice = playerInput;
        System.out.println("player: " + playerChoice + ", computer: " + computerChoice);
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
                        System.out.println("error");
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
                        System.out.println("error");
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
                        System.out.println("error");
                }
                break;
            default:
                System.out.println("error");

        }
        System.out.println("Times player won: "+numPlayerWin);
        System.out.println("times computer won: "+numComputerWin);
        System.out.println("number of ties: "+numTie);
    }

    public static void main(String[] args) {

        for(int i=0;i<100001;i++) {

            playGame(getComputerChoice());
        }


    }
}
