package exercise_8;

public class Cleric {
		
	private String name;
	private int hp;
	private final int MAX_HP = 50;
	private int mp;
	private final int MAX_MP = 10;
	
	public Cleric() {
		this.hp = MAX_HP;
		this.hp = MAX_HP;
	}
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
	}
	
	public int pray(int second) {
		int recoveredMp;
		int point = second + new java.util.Random().nextInt(3);
		if (this.mp + point <= MAX_MP) {
			recoveredMp = point;
		} else {
			recoveredMp = MAX_MP - this.mp;
		}
		return recoveredMp;
	}


}
