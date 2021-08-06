package com.api.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcYourDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
		SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
		
		int Year = Integer.parseInt(yearFormat.format(today));
		int Month = Integer.parseInt(monthFormat.format(today));
		int Day = Integer.parseInt(dayFormat.format(today));
		
		int dayCount = 0;
		
		System.out.println("태어난 해를 입력하세요.");
		int birthYear = sc.nextInt();
		System.out.println("태어난 월을 입력하세요.");
		int birthMonth = sc.nextInt();
		System.out.println("태어날 일을 입력하세요.");
		int birthDay = sc.nextInt();
		
		dayCount = (Year * 365) - (birthYear * 365);
		dayCount = dayCount + ((Month * 30) - (birthMonth * 30));
		dayCount = dayCount + Day - birthDay;
		
		System.out.println("오늘은 태어난지 " + (dayCount + 12) + "일째 입니다.");//올해까지 윤년 +12 ㅎㅎ;;;;;

	}

}
