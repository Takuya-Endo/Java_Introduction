
public class exercise_3_3 {
	
	public static void main(String[] args) {
		
		System.out.println("0か1を入力");
		int isHungry = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("食べ物の名前を入力");
		String food = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("こんにちは");
		
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}
	}

}
