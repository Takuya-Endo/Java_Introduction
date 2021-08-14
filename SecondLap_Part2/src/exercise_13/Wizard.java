package exercise_13;

public class Wizard {
	
	int hp;
	int mp;
	String name;
	Wand wand;
	
	void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * this.wand.power);
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}

}
