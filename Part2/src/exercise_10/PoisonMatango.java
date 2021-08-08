package exercise_10;

public class PoisonMatango extends Matango {
	
//	int hp = 50;
//	char suffix;	
	int poisonAttackLimit = 5;

//	public Matango(char suffix) {
//		this.suffix = suffix;
//	}	※コンストラクタは継承されない
//	↓　this()のように親クラスのコンストラクタを呼び出す必要がある
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	public void attack(Hero h) {
	  //super.attack(Hero h);//×
		super.attack(h);     //型はつけない
		//System.out.println("キノコ" + this.suffix + "の攻撃");
		//System.out.println("10のダメージ");
		//h.hp -= 10;
		
		if (this.poisonAttackLimit > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			System.out.println(h.hp / 5 + "ポイントのダメージ！");
			h.hp -= h.hp / 5;
			this.poisonAttackLimit--;
		}
		
	}
	
	public void poisonAttack(Hero h) {
		System.out.println("毒キノコ" + this.suffix + "の毒攻撃");
		System.out.println("20のダメージ");
		h.hp -= 20;
	}

}
