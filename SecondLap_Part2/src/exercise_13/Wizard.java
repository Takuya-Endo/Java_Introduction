package exercise_13;

public class Wizard {
	
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}

}
