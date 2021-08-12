package com.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

public class BookManager {
	/**
	 * 2. 객체입출력 처리용 클래스 : com.io.test4.controller.BookManager.java
	 * Field
	 ~ sc:Scanner	//초기화 객체 생성함

	 * default 생성자
	 * @author beom
	 *
	 */
		Scanner sc = new Scanner(System.in);
		File file = new File("books.dat");

		public BookManager() {
			super();
		}
		/**
		 * * Method
		+ fileSave():void
		>> 구현내용
			1. Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
			2. "books.dat" 파일에 객체 기록 저장함
			3. try with resource 문 사용할 것
			4. "books.dat 에 저장 완료!" 출력
		 */
		public void fileSave() {
			Book[] arr = new Book[5];
			arr[0] = new Book("나는 자꾸만 '딴짓'하고 싶다.", "이기진", 14500, new GregorianCalendar(2014,07,25));
			arr[1] = new Book("단 하루만 더", "미치 앨봄", 10000, new GregorianCalendar(2014,07,25));
			arr[2] = new Book("자바의 정석", "남궁성", 22500, new GregorianCalendar(2016,01,27));
			arr[3] = new Book("할수있다 개발!!", "안대범", 14500, new GregorianCalendar(2021,07,13));
			arr[4] = new Book("오늘부터 자바스크립트", "곽문기", 20700, new GregorianCalendar(2021,06,28));
	
			try(
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			){
				objectOutputStream.writeObject(arr);
				System.out.println(file + " 에 저장완료!");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		/**
		 * 
		+ fileRead():void
		 >>구현내용
		 1. Book 객체 배열 선언 : 10개
		 2. "books.dat" 파일에서 데이터 읽어서 배열에 저장함
		 3. 객체 정보를 화면에 출력함
		 4. try with resource 문 사용할 것
		 5. "books.dat 읽기 완료!" 출력
		 */
		public void fileRead() {
			Book[] arr = new Book[10];
			try(ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));)
			{
				arr = (Book [])objectInputStream.readObject();
				for(int i = 0; i<arr.length; i++) {
					System.out.println(arr[i]);
				}
				System.out.println(file + " 읽기완료!!");
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
}
