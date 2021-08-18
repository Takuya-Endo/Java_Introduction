package part2;

public class Matango {
	
	int hp = 50;
	char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Character c) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println(c.getName() + "に10のダメージ");
		c.setHp(c.getHp() - 10);
	}

}
