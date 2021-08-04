package com.oop.device;

public class Device {
		//필드
		private String brand;
		private String name;
		private int price;
		//기본생성자
		public Device() {
			super();
		}
		//파라미터생성자
		public Device(String brand, String name, int price) {
			super();
			this.brand = brand;
			this.name = name;
			this.price = price;
		}
		
		public String getBrand() {
			return brand;
		}
		
		public String getName() {
			return name;
		}
		
		public int getPrice() {
			return price;
		}
		
		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		@Override
		public String toString() {
			return "브랜드 = " + brand + ", 제품명 = " + name + ", 가격 = " + price;
		}
	
}
