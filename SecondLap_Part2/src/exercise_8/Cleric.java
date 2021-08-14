package exercise_8;

public class Cleric extends Character {

	private final int MAX_HP = 50;
	private int mp;
	private final int MAX_MP = 10;
	
	public Cleric(String name) {
		super(name);
		this.hp = MAX_HP;
		this.mp = MAX_MP;
	}
	
	public void status() {
		System.out.println(this.name + "のステータス");
		System.out.println("HP：" + this.hp);
		System.out.println("HP：" + this.mp);
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
