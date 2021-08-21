package exersise_15;

public class Exercise_15_1 {
	
	public static void main(String[] args) {
		
		int times = 20;
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 1; i < times + 1; i++) {
			stringBuilder.append(i).append(",");
		}
		
		System.out.println(stringBuilder);	
	}

}
