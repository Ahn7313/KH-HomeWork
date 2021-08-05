package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		
		double[][] arr = new double[3][3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("[%d][%d]인덱스 성적 입력", i, j);
				arr[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("index\t과목1\t과목2\t과목3\t총점\t평균");
		
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(j == 0) {
					System.out.print(i + "\t");
				}
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
				if (j == arr[i].length-1) {
					System.out.print(sum + "\t");
					System.out.print(sum/arr[i].length+"\t");
					sum = 0;
				}
			}
		}

	}
	
}
