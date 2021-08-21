package exercise_17;

public class Exercise_17_1 {
	
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
		int i = Integer.parseInt(number);
		
		System.out.println(i);
		
	}

}
