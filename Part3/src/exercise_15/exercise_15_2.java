package exercise_15;

public class exercise_15_2 {
	
	public static void main(String[] args) {
		
//		String folder = "c:\\javadev";
		String folder = "c:\\user\\";
		String file = "readme.txt";
		
		System.out.println(folder);
		
//		System.out.println("\\".matches("\\"));
		
//		if (folder.matches(".*\\$")) {
//			System.out.println(folder + file);
//		} else {
//			System.out.println(folder + "\\" + file);
//		}
		
		
		System.out.println("abc".matches(".*")); //全ての文字列
		System.out.println("A5".matches("A[0-9][0-9]?")); //最初の1文字はA、2文字目は数字、3文字目は数字か無し
		System.out.println("UACJ".matches("U[A-Z]{3}")); //最初の1文字はU、2～4文字目は英大文字
		
	}
	
}
