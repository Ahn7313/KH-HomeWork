package com.oop.device;

public class DeviceMain {

	public static void main(String[] args) {
		
		Device[] arr = new Device[10];
		arr[0] = new TV("삼성", "평면TV", 3_000_000, 10);
		arr[1] = new TV("LG", "울트라평면TV", 2_500_000, 20);
		arr[2] = new Laptop("LG", "그램17", 2_000_000, 512);
		arr[3] = new Laptop("apple", "맥북16", 3_000_000, 1024);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				break;
			}
			if (arr[i] instanceof TV) {
				((TV) arr[i]).channelUp();
			}
			else if (arr[i] instanceof Laptop) {
				System.out.println(((Laptop) arr[i]).getCapacity());
			}
		}
		//2. arr을 순회하면서
		//toString을 통해 모든 필드정보를 조회(동적바인딩)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				break;
			}
				Device device = arr[i];
				System.out.println(device.toString());				
			
		}
//		Laptop lap = new Laptop("apple", "MacBook 13", 3000000, 1024);
//		System.out.println(lap.toString());
//		TV tv = new TV("삼성", "평면TV", 3000000, 10);
//		System.out.println(tv.toString());

	}

}
