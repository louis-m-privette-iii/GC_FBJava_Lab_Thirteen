package co.grandcircus.lab_13;

import java.util.concurrent.ThreadLocalRandom;

public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
		
	}
	
	@Override
	public Roshambo generateRoshambo() {
		// Random Option 1
		int rIndex = (int) (Math.random() * 3); 
		// Random Option 2
		// int random = ThreadLocalRandom.current().nextInt(1, 4); // min, max)
		
		return Roshambo.values()[rIndex];
		
		
		
//		switch (random) {
//			case 1:
//				return Roshambo.ROCK;
//			case 2:
//				return Roshambo.PAPER;
//			case 3:
//				return Roshambo.SCISSORS;
//			default :
//					return null;
		}
	}

