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
public class TV extends Device {
	
	private int channel;

	public TV() {
		super();
	}

	public TV(String brand, String name, int price, int channel) {
		super(brand, name, price);
		
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	@Override
	public String toString() {
		return super.toString() + ", 채널 : " + channel;
	}
	
	public void channelDown() {
		
	}
	
	public void channelUp() {
		System.out.println("채널을 바꿉니다.");
	}

}
