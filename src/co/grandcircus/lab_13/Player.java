package co.grandcircus.lab_13;

public abstract class Player {
	private String name;
	
	// constructor 
	public Player(String name) {
		this.name = name;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	// return one of ROCK, PAPER, SCISSORS
	abstract public Roshambo generateRoshambo();
	
}
