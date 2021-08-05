package ncs.test4;

import java.util.Arrays;

public class TestSort {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)((Math.random() * (100 - 51)) + 51);
		}

		System.out.println("before : " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("After : " + Arrays.toString(arr));
	}

}
