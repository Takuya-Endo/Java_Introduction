package exercise_16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
		
		//インスタンスしか格納できず、基本データ型は格納できない
		//ラッパークラス型で記述するとオートボクシングによってインスタンス生成される
		//int → java.lang.Integer（java.lang.は省略可）
		Map<Hero, Integer> attackEnemies = new HashMap<Hero, Integer>();
		
		attackEnemies.put(hero1, 3);
		attackEnemies.put(hero2, 7);
		
		for (Hero key : attackEnemies.keySet()) {
			
			int enemies = attackEnemies.get(key);
			System.out.println(key + "が倒した敵＝" + enemies);
			
		}
		
	}

}
