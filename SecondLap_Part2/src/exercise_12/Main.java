package exercise_12;

public class Main {
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		Y[] array = new Y[] {a, b};
		
		for (Y element : array) {
			element.b();
		}
		
	}

}
