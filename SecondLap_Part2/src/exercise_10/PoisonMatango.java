package exercise_10;

import exercise_8.Character;

public class PoisonMatango extends Matango {
	
	private int attackableTimes;
	
	public PoisonMatango(char suffix) {
		super(suffix);
		this.attackableTimes = 5;
	}
	
	public void poisonAttack(Character c) {
		super.attack(c);
		if (this.attackableTimes > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			c.setHp(c.getHp() / 5);
			System.out.println(c.getHp() / 5 + "ポイントのダメージ！");
			this.attackableTimes--;
		}
	}

}
