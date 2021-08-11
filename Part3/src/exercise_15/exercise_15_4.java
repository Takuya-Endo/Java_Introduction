package exercise_15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class exercise_15_4 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("西暦yyyy年MM月dd日");
		
		Date now = new Date();
		String nowString = dateFormat.format(now);
		System.out.println("現在の日付は" + nowString);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, day + 100);
		Date future = calendar.getTime();
		
		String futureString = dateFormat.format(future);
		System.out.println("１００日後は" + futureString);
		
	}

}
