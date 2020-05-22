package com.ict.edu;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Test4 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		
	Calendar now = Calendar.getInstance();
	
	System.out.print(now.get(Calendar.YEAR)+ "년 ");
	System.out.print(now.get(Calendar.MONTH)+ "월 ");
	System.out.println(now.get(Calendar.DAY_OF_MONTH)+ "일 ");
	
	int d = now.get(Calendar.DAY_OF_WEEK);
	switch (d) {
	case 0: System.out.println("일요일"); break;
	case 1: System.out.println("월요일"); break;
	case 2: System.out.println("화요일"); break;
	case 3: System.out.println("수요일"); break;
	case 4: System.out.println("목요일"); break;
	case 5: System.out.println("금요일"); break;
	case 6: System.out.println("토요일"); break;
	}
	
	System.out.print(now.get(Calendar.HOUR)+ "시 ");
	System.out.print(now.get(Calendar.MINUTE)+ "분 ");
	System.out.print(now.get(Calendar.SECOND)+ "초 ");
	}
}
