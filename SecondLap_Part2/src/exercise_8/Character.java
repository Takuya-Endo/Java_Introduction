package exercise_8;

public abstract class Character {
	
	String name;
	int hp;
	
	public Character(String name) {
		this.name = name;
	}
	
	public abstract void status();
	public abstract String getName();
	public abstract int getHp();
	public abstract void setHp(int hp);

}
