package member.controller;
 

import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

/**
 * 
 * Control 클래스 이름 : MemberManager
MemberManager 멤버변수 : Silver 등급을 최대 10명, Gold 등급을 최대 10명 관리할수 있는  객체배열 , 인덱스 추가
MemberManager 멤버메소드 : silverInsert, goldInsert, printData 
8/3
Control 클래스 이름 : memer.controller.MemberManager
MemberManager 멤버변수 Member[] : Silver 등급, Gold 등급등 회원을 최대 40명 관리할수 있는  객체배열, 인덱스 추가
MemberManager 멤버함수 : insertMember(Member m), printData 
 *
 */
public class MemberManager {
	
	Member[] arr = new Member[40];
	int index = 0;
	
	public void insertMember(Member m) {
		this.arr[index++] = m;
	}
	
	public void printData() {
		
		System.out.println("=============회원정보==============");
		System.out.println("이름\t 등급\t 포인트\t 이자포인트\t");
		System.out.println("=================================");
		
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i].getName() + " \t" + arr[i].getGrade() + " \t" + arr[i].getPoint() + " \t" + arr[i].getInterestPoint());
		}
		
	}
	
	
//	private Silver[] silverArr = new Silver[10];
//	private Gold[] goldArr = new Gold[10];
//	private Vip[] vipArr = new Vip[10];
//	private Vvip[] vvipArr = new Vvip[10];
//	
//	public void silverInsert(Silver silver) {
//		for (int i = 0; i < silverArr.length; i++) {
//			if (silverArr[i] == null) {
//				silverArr[i] = silver;
//				break;
//			}
//		}
//	}
//	
//	public void goldInsert(Gold gold) {
//		for (int i = 0; i < goldArr.length; i++) {
//			if (goldArr[i] == null) {
//				goldArr[i] = gold;
//				break;
//			}
//		}
//	}
//	
//	public void vipInsert(Vip vip) {
//		for (int i = 0; i < vipArr.length; i++) {
//			if (vipArr[i] == null) {
//				vipArr[i] = vip;
//				break;
//			}
//		}
//	}
//	
//	public void vvipInsert(Vvip vvip) {
//		for (int i = 0; i < vvipArr.length; i++) {
//			if(vvipArr[i] == null) {
//				vvipArr[i] = vvip;
//				break;
//			}
//		}
//	}
//	
//	public void printData() {
//		
//		System.out.println("=============회원정보==============");
//		System.out.println("이름\t 등급\t 포인트\t 이자포인트\t");
//		
//		for (int i = 0; i < silverArr.length; i++) {
//			if (silverArr[i] == null) {
//				break;
//			}
//				System.out.println(silverArr[i].getName() + "\t" + silverArr[i].getGrade() + "\t" + 
//						silverArr[i].getPoint() + "\t" + silverArr[i].getInterestPoint());
//			
//		}
//		for(int i = 0; i < goldArr.length; i++) {
//			if (goldArr[i] != null) {
//				System.out.println(goldArr[i].getName() + "\t" + goldArr[i].getGrade() + "\t" + 
//						goldArr[i].getPoint() + "\t" + goldArr[i].getInterestPoint());
//			}
//		}
//		for(int i = 0; i < vipArr.length; i++) {
//			if (vipArr[i] != null) {
//				System.out.println(vipArr[i].getName() + "\t" + vipArr[i].getGrade() + "\t" + 
//						vipArr[i].getPoint() + "\t" + vipArr[i].getInterestPoint());
//			}
//		}
//		for(int i = 0; i < vvipArr.length; i++) {
//			if (vvipArr[i] != null) {
//				System.out.println(vvipArr[i].getName() + "\t" + vvipArr[i].getGrade() + "\t" + 
//						vvipArr[i].getPoint() + "\t" + vvipArr[i].getInterestPoint());
//			}
//		}
//		
//	}
	
}