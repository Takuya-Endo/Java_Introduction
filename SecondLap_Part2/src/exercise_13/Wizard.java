package exercise_13;

import exercise_8.Character;

public class Wizard extends Character {
	
	private String name;
	private final int MAX_HP = 80;
	private final int MAX_MP = 50;
	private int hp;
	private int mp;
//	private Wand wand;
	
	public Wizard(String name) {
		super(name);
		this.hp = MAX_HP;
		this.mp = MAX_MP;
	}
	
	public void status() {
		System.out.println("");
		System.out.println("―――――");
		System.out.println(this.name + "のステータス");
		System.out.println("HP：" + this.hp);
		System.out.println("MP：" + this.mp);
		System.out.println("―――――");
		System.out.println("");
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
//	
//	void heal(Character c) {
//		int basePoint = 10;
//		int recoverPoint = (int) (basePoint * this.wand.getPower());
//		c.setHp(c.getHp() + recoverPoint);
//		System.out.println(c.getName() + "のHPを" + recoverPoint + "回復した！");
//	}

}
