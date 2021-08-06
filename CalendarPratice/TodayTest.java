package com.api.calendar;

import java.time.LocalDate;

public class TodayTest {
/**
오늘 날짜를 다음 형식으로 출력하세요.

-> 오늘은 2019년 8월 5일 목요일
 */
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.of(2019, 8, 5);
		char[] ch = {'일','월', '화', '수', '목', '금', '토'};
		int dayOfWeek = today.getDayOfWeek().getValue();

		System.out.println("오늘은 " + today.getYear() + "년 " + today.getMonthValue() + "월 " + today.getDayOfMonth() + "일 "
				+ ch[dayOfWeek + 3] + "요일");

	}

}
