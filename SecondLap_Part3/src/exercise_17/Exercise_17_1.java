package exercise_17;

//import java.io.IOException;

public class Exercise_17_1 {
	
//	public static void main(String[] args) throws IOException {
	public static void main(String[] args) {
		
		String s = null;
		
		try {
			
			System.out.println(s.length());
			
		} catch (NullPointerException e) {
			
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("――スタックトレース(ここから)――");
			e.printStackTrace();
			System.out.println("――スタックトレース(ここまで)――");
			
		}
		
		
		String number = "三";
//		String number = "3";
		
		try {
			
			int i = Integer.parseInt(number);
			System.out.println("");
			System.out.println(i);
			
		} catch (NumberFormatException e) {
			
			System.out.println("");
			System.out.println(e.getMessage());
			
		}
		
//		throw new IOException();
		
	}

}
