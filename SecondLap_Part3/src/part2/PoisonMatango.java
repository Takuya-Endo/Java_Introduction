package part2;

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
			int damage = c.getHp() / 5;
			System.out.println(c.getName() + "に" + damage + "ポイントのダメージ！");
			this.attackableTimes--;
			c.setHp(c.getHp() - damage);
		}
	}

}
