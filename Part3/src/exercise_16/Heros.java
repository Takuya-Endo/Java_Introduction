package exercise_16;

import java.util.ArrayList;

public class Heros {
	
	public static void main(String[] args) {
		
		Hero hero1 = new Hero("齋藤");
		Hero hero2 = new Hero("鈴木");
		ArrayList<Hero> heros = new ArrayList<Hero>();
		
		heros.add(hero1);
		heros.add(hero2);
		
		for (Hero hero : heros) {
			System.out.println(hero.getName());
		}
		
	}

}
