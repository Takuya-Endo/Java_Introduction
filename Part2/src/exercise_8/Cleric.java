package exercise_8;

public class Cleric {
	
	String name = "聖職者「クレリック」";
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
	}
	
}
