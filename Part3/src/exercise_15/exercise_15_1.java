package exercise_15;

public class exercise_15_1 {
	
	public static void main(String[] args) {
		
		int number =1;
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < 10; i++) {
			
			stringBuilder.append(number);
			stringBuilder.append(", ");
			number++;
			
		}
		
		String s = stringBuilder.toString();
		System.out.println(s);
		
	}

}
