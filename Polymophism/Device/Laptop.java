package com.oop.device;
/**
 * 
 * 다음과 같은 상속관계를 가질때, 다음 main메소드 실행코드를 정상 수행하기 위한 코드를 완성하세요.
* 기본생성자/파라미터생성자/getter/setter
* 모든 필드 정보를 확인할 수 있는 메소드 toString
* Laptop은 capacity(용량 GB) 필드와 getter/setter 추가
* TV는 channel필드, getter/setter, channelUp, channelDown메소드 추가
 *
 */
public class Laptop extends Device {

	private int capacity;

	public Laptop() {
		super();
	}

	public Laptop(String brand, String name, int price, int capacity) {
		super(brand, name, price);
		
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return super.toString() + ", " + "용량 = " + capacity;
	}
	
	
}
