
public class exercise_5_3 {
	
	public static void main(String[] args) {
		
		String title = "挨拶メール";
		String address = "example-1@email.com";
		String text = "こんにちは。";
		email(title, address, text);
		
		address = "example-2@email.com";
		text = "こんばんは。";
		email(address, text);
		
	}
	
	public static void email(String title, String address, String text) {
		
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
		
	}
	
	public static void email(String address, String text) {
		
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
		
	}

}
