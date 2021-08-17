package exercise_8;

public class Cleric extends Character {

	private final int MAX_HP = 50;
	private int mp;
	private final int MAX_MP = 10;
	
	public Cleric(String name) {
		super(name);
		this.setHp(MAX_HP);
		this.mp = MAX_MP;
	}
	
	public void status() {
		System.out.println(this.getName() + "のステータス");
		System.out.println("HP：" + this.getHp());
		System.out.println("MP：" + this.mp);
		System.out.println("―――――");
	}
	
	public void selfAid() {
		System.out.println(this.getName() + "は“セルフエイド”を使った");
		this.mp -= 5;
		this.setHp(MAX_HP);
	}
	
	public void prayRecover(int second) {
		System.out.println(this.getName() + "は" + second + "秒間祈った");
		this.mp += pray(second);
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
