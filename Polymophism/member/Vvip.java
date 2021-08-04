package member.model.vo;

public class Vvip extends Member {

	public Vvip() {
		super();
	}

	public Vvip(String name, String grade, int point) {
		super(name, grade, point);
	}
	@Override
	public double getInterestPoint() {
		return super.getPoint() * 0.15;
	}
	
}


//	private String vvipName;
//	private String vvipGrade;
//	private int vvipPoint;
//	
//	public Vvip() {}
//
//	public Vvip(String vvipName, String vvipGrade, int vvipPoint) {
//		this.vvipName = vvipName;
//		this.vvipGrade = vvipGrade;
//		this.vvipPoint = vvipPoint;
//	}
//
//	public String getVvipName() {
//		return vvipName;
//	}
//	public void setVvipName(String vvipName) {
//		this.vvipName = vvipName;
//	}
//	public String getVvipGrade() {
//		return vvipGrade;
//	}
//	public void setVvipGrade(String vvipGrade) {
//		this.vvipGrade = vvipGrade;
//	}
//	public int getVvipPoint() {
//		return vvipPoint;
//	}
//	public void setVvipPoint(int vvipPoint) {
//		this.vvipPoint = vvipPoint;
//	}
//	public double getVvipInterestPoint() {
//		return getVvipPoint() * 0.15;
//	}
//	
//}
