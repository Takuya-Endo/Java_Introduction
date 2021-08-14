package exercise_8;
import exercise_10.Matango;

public class Main {
	
	public static void main(String[] args) {
		
		Matango matango = new Matango('A');
		Character cleric = new Cleric("聖職者クレリック");
		
		cleric.status();
		
		matango.attack(cleric);
		
		
	}

}
