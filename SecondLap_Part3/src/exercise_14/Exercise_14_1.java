package exercise_14;

public class Exercise_14_1 {
	
	public static void main(String[] args) {
		
		Account a = new Account("4649", 1592);
		Account b = new Account(" 4649", 1592);
		Account c = new Account("4649", 0);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if (a.equals(b)) {
			System.out.println("aとbは等価である");
		} else {
			System.out.println("aとbは等価でない");
		}
		
		if (a.equals(c)) {
			System.out.println("aとcは等価である");
		} else {
			System.out.println("aとcは等価でない");
		}
		
	}

}
