package exercise_14;

public class Cleric {
	
	String name = "聖職者「クレリック」";
	int hp = 50;
	final static int MAX_HP = 50;
	int mp = 10;
	final static int MAX_MP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
	}
	
	public int pray(int praySecond) {
		
		int recoveryAmount = praySecond + new java.util.Random().nextInt(3);
		
		if ((this.mp + recoveryAmount) <= MAX_MP) {
			
			this.mp += recoveryAmount;			
			return this.mp;
			
		} else {
			
			return MAX_MP;
			
		}
		
	}

}
