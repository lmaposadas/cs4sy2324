/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4q1exer4_truthposadas;

/**
 *
 * @author marielleposadas
 */
public class Move {
    private final String name;
	private Move strongAgainst;
    
    public Move(String name){
        this.name = name;
        this.strongAgainst = null;
    }
	
    public String getName(){
        return this.name;
    }
    public Move getStrongAgainst(){
	return this.strongAgainst;
    }
    public void setStrongAgainst(Move strongAgainst){
	this.strongAgainst = strongAgainst;
    }
    public static void introduction() {
        String greeting = "Welcome to Rock, Paper, Scissors. Please choose an option: \n";
        String start = "1. Start game\n";
        String rounds = "2. Change number of rounds\n";
        String exit = "3. Exit application\n";
        System.out.printf("%s%s%s%s%s", greeting, start, rounds, exit, "> ");
    }
    public static void gameIn() {
        String computer = "The computer has selected its move. Select your move: \n";
        String rockOption = "1. Rock\n";
        String paperOption = "2. Paper\n";
        String scissorsOption = "3. Scissors\n";
        System.out.printf("%s%s%s%s", computer, rockOption, paperOption, scissorsOption);
        System.out.printf("> ");
    }
    public static int compareMoves(Move m1, Move m2){
	// This method returns 0 if m1 wins, 1 if m2 wins, and 2 if neither wins
	if(m1.getStrongAgainst() ==  m2) return 0;
	else if (m2.getStrongAgainst() == m1) return 1;
	else return 2;
	}
}
