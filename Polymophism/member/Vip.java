package member.model.vo;

public class Vip extends Member {

	public Vip() {
		super();
	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	@Override
	public double getInterestPoint() {
		return super.getPoint() * 0.1;
	}
	
}
	
	
	

//	private String vipName;
//	private String vipGrade;
//	private int vipPoint;
//	
//	public Vip() {}
//
//	public Vip(String vipName, String vipGrade, int vipPoint) {
//		this.vipName = vipName;
//		this.vipGrade = vipGrade;
//		this.vipPoint = vipPoint;
//	}
//
//	public String getVipName() {
//		return vipName;
//	}
//	public void setVipName(String vipName) {
//		this.vipName = vipName;
//	}
//	public String getVipGrade() {
//		return vipGrade;
//	}
//	public void setVipGrade(String vipGrade) {
//		this.vipGrade = vipGrade;
//	}
//	public int getVipPoint() {
//		return vipPoint;
//	}
//	public void setVipPoint(int vipPoint) {
//		this.vipPoint = vipPoint;
//	}
//	public double getVipInterestPoint() {
//		return getVipPoint() * 0.1;
//	}
//	
//	
