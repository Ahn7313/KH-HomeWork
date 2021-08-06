package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcDday {

	public static void main(String[] args) {
		
		CalcDday calcDday = new CalcDday();
		calcDday.test2();

	}
	/**
Calendar클래스를 이용해서 D-DAY계산기를 만드세요.
출력은 다음과 같습니다.

 ->  193일 남았습니다. 	(D-DAY 전)
 ->  D-DAY입니다.      	(D-DAY)	
 ->  20일 지났습니다.	(D-DAY가 지난 경우)
	 */
	public void test2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		System.out.println("일을 입력하세요.");
		int day = sc.nextInt();
		
		Calendar dday = new GregorianCalendar(year, month - 1, day);
		Calendar today = Calendar.getInstance();
		double diff = dday.getTimeInMillis() - today.getTimeInMillis();
		
		diff = diff / 1000 / 60 / 60 / 24;
//		System.out.printf("%.0f",diff);
		if (Math.ceil(diff) >= 1) {
			System.out.printf("%.0f일 남았습니다.", Math.ceil(diff));
		}
		else if (Math.ceil(diff) == 0) {
			System.out.println("D-Day입니다.");
		}
		else {
			System.out.printf("%.0f일 지났습니다.", Math.ceil(diff) * -1);
		}
		
	}

}
