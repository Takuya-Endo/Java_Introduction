package exercise_13;

import exercise_8.Character;

public class Wizard extends Character {
	
	private final int MAX_HP = 80;
	private final int MAX_MP = 50;
	private int mp;
	private Wand wand;
	
	public Wizard(String name) {
		super(name);
		this.setHp(MAX_HP);
		this.mp = MAX_MP;
		this.wand = new Wand();
	}
	
	public void status() {
		System.out.println("");
		System.out.println("―――――");
		System.out.println(this.getName() + "のステータス");
		System.out.println("HP：" + this.getHp());
		System.out.println("MP：" + this.mp);
		System.out.println("武器：" + wand.getName());
		System.out.println("―――――");
		System.out.println("");
	}
	
//	void heal(Character c) {
//		int basePoint = 10;
//		int recoverPoint = (int) (basePoint * this.wand.getPower());
//		c.setHp(c.getHp() + recoverPoint);
//		System.out.println(c.getName() + "のHPを" + recoverPoint + "回復した！");
//	}

}
