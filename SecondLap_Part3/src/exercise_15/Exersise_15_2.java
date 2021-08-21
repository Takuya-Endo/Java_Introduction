package exercise_15;

public class Exersise_15_2 {
	
	public static void main(String[] args) {
		
		String folder = "c:\\javadev\\";
//		String folder = "c:\\javadev";
		String file = "readme.text";
		
		if (folder.endsWith("\\")) {
			System.out.println(folder + file);
		} else {
			System.out.println(folder + "\\" + file);
		}
		
	}

}
