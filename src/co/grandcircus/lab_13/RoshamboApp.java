package co.grandcircus.lab_13;

import java.util.Arrays;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		Roshambo rock = Roshambo.ROCK;
		Roshambo paper = Roshambo.PAPER;
		Roshambo scissors = Roshambo.SCISSORS;
		
		System.out.println(rock.compareTo(rock));
		
		System.out.println("");
		
		// Create user as a UserPlayer
		String userPlayer = Validator.getString(scnr, "Enter your name: ");
		System.out.println("Hello ", userPlayer, " !");
		
		UserPlayer user = new UserPlayer(userPlayer, scnr);
		
		
		// Creates a challenger as a CopmuterPlayer
		int opponent = Validator.getInt(scnr,  "Select opponent (1 or 2): ", 1, 2);
		
		Player challenger;
		if (opponent == 1) {
			challenger = new RandomPlayer("Randy");
			System.out.println("You are playing against Randy!");
		} else {
			challenger = new RockPlayer("Rocky");
			System.out.println("You are playing against Rocky!");
		}
		
		// Game loop structure
		String cont = "y";
		do {
			
			playTheGame(user, challenger);
			
			cont = Validator.getString(scnr, "y/n? ");
		} while (cont.matches("[yY).*"));
		
		System.out.println("THE END!");
		
		scnr.close();
	}

	private static void playTheGame(UserPlayer user, Player challenger) {
		// String input = Validator.getStringMatchingRegex(scnr, "Rock, Paper, Scissors", "rock|paper|scissors")
		
		Roshambo input = user.generateRoshambo();
		
		Roshambo computerOutput = challenger.generateRoshambo();
		
		System.out.println(input);
		System.out.println(computerOutput);
		System.out.println("Who won? "); // TODO do this in separate method. WIN DRAW LOSE ex input = output user && S, S && P, P && R
	
	}
	public static void whoWon(String name, Roshambo input, Roshambo output) {
		if (input == Roshambo.PAPER && output == Roshambo.ROCK) {
		System.out.println(human.getName() + " won!");
		{
	}
}
p