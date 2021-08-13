package exercise_10;

public class PoisonMatango extends Matango {
	
	private int attackableTimes;
	
	public PoisonMatango(char suffix) {
		super(suffix);
		this.attackableTimes = 5;
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (this.attackableTimes > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			h.hp -= (h.hp / 5);
			System.out.println(h.hp / 5 + "ポイントのダメージ！");
			this.attackableTimes--;
		}
	}
	
	public void poisonAttack(Hero h) {
		
	}

}
