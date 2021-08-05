package ncs.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = new String[5];
		
		while (true) {
			System.out.println("숫자 5개를 입력하세요.");
			String str = sc.nextLine();
			strArr = str.split(" ");
			
			if (strArr.length == 5) {
				break;
			} else {
				System.out.println("다시입력하새요.");
			}
		}
		
		double[] doubleArr = new double[5];
		
		for (int i = 0; i < doubleArr.length; i++) {
			
		}

	}

}
