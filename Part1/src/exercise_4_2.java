
public class exercise_4_2 {
	
	public static void main(String[] args) {
		
		int[] moneyList = {121_902, 8_302, 55_100};
		
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);					
		}
		
		for (int moneyElement : moneyList) {
			System.out.println(moneyElement);
		}
		
	}

}
