package co.grandcircus.lab_13;

import java.util.Scanner;

public class UserPlayer extends Player {

	private Scanner scnr;
	
	// constructor
	public UserPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {
		String choice = Validator.getStringMatchingRegex(scnr,
				"Would you like to play Rock, Paper or Scissors?",
				"rock|paper|scissors");
		if (choice.equals("rock")) {
			return Roshambo.ROCK;
		} else if (choice.equals("paper")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}
	
}
