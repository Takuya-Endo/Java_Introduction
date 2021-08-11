package exercise_15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class exercise_15_5 {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		
		LocalDate now = LocalDate.now();
		String nowString = now.format(dateFormat);
		System.out.println("現在の日付は" + nowString);
		
		LocalDate future = now.plusDays(100);
		String futureString = future.format(dateFormat);
		System.out.println("１００日後は" + futureString);
		
	}

}
