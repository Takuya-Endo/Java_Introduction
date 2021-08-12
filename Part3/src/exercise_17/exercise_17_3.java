package exercise_17;

public class exercise_17_3 {
	
	public static void main(String[] args) {
		
		String stringIntI = "三";
		
		try {
			int i = Integer.parseInt(stringIntI);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("文字列「" + stringIntI + "」は解析可能な整数型ではありません");
		}
		
	}

}
