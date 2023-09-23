/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4q1exer4_truthposadas;

import java.util.Scanner;

/**
 *
 * @author marielleposadas
 */
public class RockPaperScissors {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int repeat = 1; 
        int roundsToWin = 2;
        
            while (repeat == 1) {
            Move.introduction();
            int firstResponse = sc.nextInt();
            
            switch (firstResponse) {
            case 1:
            int playerScore = 0;
            int compScore = 0;
            System.out.println("This match will be first to " + roundsToWin + " wins.\n");
            
            while (playerScore < roundsToWin && compScore < roundsToWin) {
                Move.gameIn();
                int playerMove = sc.nextInt();

                Move rock = new Move("Rock");
                Move paper = new Move("Paper");
                Move scissors = new Move("Scissors");
                Move playerChoice = null;
                Move compChoice = null;

                switch(playerMove){
                    case 1:
                        playerChoice = rock;
                        break;
                    case 2:
                        playerChoice = paper;
                        break;
                    case 3:
                        playerChoice = scissors;
                        break;
                    default:
                        System.out.println("invalid");
                 }

                int compMove = (int) Math.floor(Math.random()*3) + 1;
                switch(compMove){
                    case 1:
                        compChoice = rock;
                        break;
                    case 2:
                        compChoice = paper;
                        break;
                    case 3:
                        compChoice = scissors;
                        break;
                    default:
                        System.out.println("invalid");
                }
                rock.setStrongAgainst(scissors);
                paper.setStrongAgainst(rock);
                scissors.setStrongAgainst(paper);

                int winner = Move.compareMoves(playerChoice, compChoice);
                System.out.println("Player chose " + playerChoice.getName() + ". Computer chose " + compChoice.getName() + ".");
                switch(winner){
                    case 0:
                        System.out.println("Player wins round!");
                        playerScore++;
                        break;
                    case 1:
                        System.out.println("Computer wins round!");
                        compScore++;
                        break;
                    case 2:
                        System.out.println("Neither wins round.");
                        break;
                    default:
                        System.out.println("invalid\n");
                 }
                System.out.println("Player - " + playerScore + " Computer - " + compScore + "\n");
            } // while bracket
                
            break; 
            
            case 2:
                System.out.println("\nHow many wins are needed to win a match?");
                System.out.printf("> ");
                roundsToWin = sc.nextInt();
                System.out.println("\nNew setting has been saved!\n");
            break;
            
            case 3: 
                repeat = 0;
                System.out.println("\nThank you for playing!\n");
            break;
            
            default:
                System.out.println("Please enter a valid option.");
            }
	}
    }
}
