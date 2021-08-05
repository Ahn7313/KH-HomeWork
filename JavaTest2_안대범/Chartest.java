package ncs.test2;

import java.util.Scanner;

public class Chartest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영단어를 입력하세요.");
		String str = sc.next().toUpperCase();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
