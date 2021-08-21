package part2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Matango matango = new Matango('A');
		PoisonMatango poisonMatango = new PoisonMatango('B');
		Cleric cleric = new Cleric("聖職者クレリック");
		Wizard wizard = new Wizard("魔法使いウィザード");
		Character[] characters = {cleric, wizard};
		
//		wizard.setWizardName("魔法使");
//		wizard.setWizardHp(0);
		
		characterStatus(characters);
		matango.attack(cleric);
		poisonMatango.poisonAttack(cleric);
		characterStatus(characters);
		cleric.selfAid();
		characterStatus(characters);
		cleric.prayRecover(5);
		characterStatus(characters);
		matango.attack(cleric);
		characterStatus(characters);
		wizard.heal(cleric);
		characterStatus(characters);
		
		
		System.out.println(chooseNumber());
		
//		System.out.println(chooseNumber());
		
	}
	
	public static void characterStatus(Character[] characters) {
		System.out.println("");
		System.out.println("―――――");
		for (Character character : characters) {
			character.status();
		}
		System.out.println("");
	}
	
	public static String chooseNumber() {
		
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.println("数字を入力してください");
			String number = scanner.next();
			if (! (number.matches("[0-9]"))) {
				throw new Exception("数字以外が入力されました");
			}
			return number;
		} catch(Exception e) {
			return e.getMessage();
		}
		
	}
	
}
