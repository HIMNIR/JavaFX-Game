package game.model;
public class Player {
	
	private String name;
	private final String password;
	private int high_score;
	public Player(String name,String password, int high_score) {
		this.name = name;
	    this.password = password;
	    this.high_score = high_score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHigh_score(int high_score) {
		this.high_score = high_score;
	}
	public String getName() {
		return name;
	}

	public int high_score() {
		return high_score;
	}

	

}


