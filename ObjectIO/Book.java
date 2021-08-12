package com.io.test4.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 1. 객체로 사용할 클래스 : com.io.test4.model.vo.Book.java //직렬화 처리함

	* Field
	- title:String	//도서명
	- author:String	//저자
	- price:int	//가격
	- dates:Calendar	//출판날짜

	* Constructor
	+ 디폴트 생성자
	+ 매개변수 있는 생성자

	* Method
	+ Setters ans Getters 작성
	+ toString():String		//Override
		: 날짜에 포맷 적용함 ("yyyy'년' MM'월' dd'일 출간')
 * @author beom
 *
 */
public class Book implements Serializable {
	
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price, Calendar dates) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 mm월 dd일 출간");
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", dates=" + format.format(dates.getTime()) + "]";
	}
	
	

}
