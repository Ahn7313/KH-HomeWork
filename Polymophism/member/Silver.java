package member.model.vo;
/**
 * 
 * Silver,Gold 멤버변수 : 이름 name,등급 grade ,포인트 point
Silver,Gold 멤버함수 : 컨스트럭터(생성자) , setter/getter(이자포인트 getter추가)
---> 실버 등급은 2% 를 곱한값이 이자 포인트
---> 골드 등급은 5% 를 곱한값이 이자 포인트
 *
 */
public class Silver extends Member {

	public Silver() {
		super();
	}

	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
	@Override
	public double getInterestPoint() {
		return super.getPoint() * 0.02;
	}
	
}
	
//	private String silverName;
//	private String silverGrade;
//	private int silverPoint;
//	
//	public Silver() {}
//	
//	public Silver(String silverName, String silverGrade, int silverPoint) {
//		this.silverName = silverName;
//		this.silverGrade = silverGrade;
//		this.silverPoint = silverPoint;
//	}
//	
//	public String getSiverName() {
//		return silverName;
//	}
//	public void setSiverName(String silverName) {
//		this.silverName = silverName;
//	}
//	public String getSilverGrade() {
//		return silverGrade;
//	}
//	public void setSilverGrade(String silverGrade) {
//		this.silverGrade = silverGrade;
//	}
//	public int getSilverPoint() {
//		return silverPoint;
//	}
//	public void setSilverPoint(int silverPoint) {
//		this.silverPoint = silverPoint;
//	}
//	public double getSilverInterestPoint() {
//		return getSilverPoint() * 0.02;
//	}
//	
//}
