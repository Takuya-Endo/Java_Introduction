package exercise_15;

public class exercise_15_1 {
	
	public static void main(String[] args) {
		
		int number =1;
		int length = 20;
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < length; i++) {
			
			stringBuilder.append(number);
			stringBuilder.append(", ");
			number++;
			
		}
		
		String s = stringBuilder.toString();
		System.out.println(s);
		
		String[] a = new String[length];
		
//		for (int i = 0; i < length; i ++) {
			
//			a[i] = s.substring(0, s.indexOf(", "));
//			s = s.substring(s.indexOf(", ") + 2);
		
//		}
		
		a = s.split(",");
		
		
		System.out.println(a[0]);
		System.out.println(a[50]);
		System.out.println(a[99]);
		
	}

}
