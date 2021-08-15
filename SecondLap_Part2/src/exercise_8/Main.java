package exercise_8;

import exercise_10.Matango;
import exercise_10.PoisonMatango;
import exercise_13.Wizard;

public class Main {
	
	public static void main(String[] args) {
		
		Matango matango = new Matango('A');
		PoisonMatango poisonMatango = new PoisonMatango('B');
		Cleric cleric = new Cleric("聖職者クレリック");
		Wizard wizard = new Wizard("魔法使いウィザード");
		
		cleric.status();
		wizard.status();
		matango.attack(cleric);
		poisonMatango.poisonAttack(cleric);
		cleric.status();
		cleric.selfAid();
		cleric.status();
		
	}

}