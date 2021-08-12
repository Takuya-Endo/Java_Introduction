package exercise_17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class exercise_17_4 {
	
	public static void main(String[] args) {
		
		String pathName = "存在しないファイル";
		File file = new File(pathName);
		
		try (FileWriter fileWriter = new FileWriter(file);) {
			if (pathName.equals("存在しないファイル")) {
				throw new IOException();
			}
			System.out.println("ファイルの出力");
		} catch (IOException e) {
			System.out.println("異常終了：指定されたファイルが存在しません");
		}
		
	}

}
