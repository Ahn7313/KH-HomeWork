package member.model.vo;
/**
 * 
 * Silver,Gold 멤버변수 : 이름 name,등급 grade ,포인트 point
Silver,Gold 멤버함수 : 컨스트럭터(생성자) , setter/getter(이자포인트 getter추가)
---> 실버 등급은 2% 를 곱한값이 이자 포인트
---> 골드 등급은 5% 를 곱한값이 이자 포인트
 *
 */
public class Gold extends Member {

	public Gold() {
		super();
	}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	@Override
	public double getInterestPoint() {
		return super.getPoint() * 0.05;
	}
	
}
	
	
//	public Gold() {}
//
//	public Gold(String goldName, String goldGrade, int goldPoint) {
//		this.goldName = goldName;
//		this.goldGrade = goldGrade;
//		this.goldPoint = goldPoint;
//	}
//
//	public String getGoldName() {
//		return goldName;
//	}
//	public void setGoldName(String goldName) {
//		this.goldName = goldName;
//	}
//	public String getGoldGrade() {
//		return goldGrade;
//	}
//	public void setGoldGrade(String goldGrade) {
//		this.goldGrade = goldGrade;
//	}
//	public int getGoldPoint() {
//		return goldPoint;
//	}
//	public void setGoldPoint(int goldPoint) {
//		this.goldPoint = goldPoint;
//	}
//
//}
