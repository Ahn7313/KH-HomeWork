package com.io.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) {
		
		Test1 name = new Test1();
//		name.fileSave();
		name.fileRead();

	}
	/**
	 *  - 위에서 작성한 클래스에 메소드 추가함
 	>> 메소드
	+ fileRead() : void
	=> 키보드로 읽을 대상파일명을 입력받음
	=> 파일 읽기용 스트림 객체 생성함 : FileReader 사용
	=> 파일 안의 내용을 읽어서, StringBuilder 에 보관함
	=> 다 읽은 다음, StringBuilder 에 보관된 값을 
	   String으로 바꾸어 화면에 출력함

	 */
	public void fileRead() {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("읽어올 파일내용을 입력하세요.");
		
		try {
			br = new BufferedReader(new FileReader(br.readLine()));
			
			String data = null;
			
			while ((data = br.readLine()) != null) {
				
				sb.append(data);
				sb.append("\n");
				
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 	+ fileSave() : void
	=> 키보드로 사용할 파일명을 입력받음
		BufferedReader의 readLine() 사용함
	=> 파일출력용 스트림 객체 생성함
		FileWriter 사용함
	=> 화면에 "파일에 저장할 내용을 입력하시오." 출력
		입력값을 읽어들여서 바로 파일에 기록 저장처리
		반복실행함
	=> "exit"가 입력되면, 반복은 종료하고
		화면에 "파일에 성공적으로 저장되었습니다." 출력하고
	=> 파일출력 스트림을 닫음.
	 */
	public void fileSave() {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("파일에 저장할 내용을 입력하시오.");
			bw = new BufferedWriter(new FileWriter("test1.txt"));
		
			String data = null;
		
			while((data = br.readLine()) != null) {
				if (data.equals("exit")) {
					break;
				}
				bw.write(data);
				bw.write("\n");
			}
			System.out.println("파일에 성공적으로 저장했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
