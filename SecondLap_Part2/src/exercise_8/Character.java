package exercise_8;

public abstract class Character {
	
	private String name;
	private int hp;
	
	public Character(String name) {
		this.name = name;
	}
	
	public abstract void status();
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}

}
