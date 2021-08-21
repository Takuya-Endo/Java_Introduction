package exercise_15;

public class Exercise_15_1 {
	
	public static void main(String[] args) {
		
		int times = 100;
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 1; i < times + 1; i++) {
			stringBuilder.append(i).append(",");
		}
		
//		System.out.println(stringBuilder.toString());
//		System.out.println(stringBuilder);
		
		String number = stringBuilder.toString();
		
		String[] numbers = new String[times];
		numbers = number.split(",");
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[50]);
		System.out.println(numbers[times - 1]);
		
	}

}
