package ncs.test3;

public class TVTest {

	public static void main(String[] args) {
		
		Tv[] tvArray = new Tv[3];
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");
		Tv maxPrice = tvArray[0];
		Tv minPrice = tvArray[0];
		
		for (int i = 0; i < tvArray.length; i++) {
			System.out.println(tvArray[i]);
			maxPrice = tvArray[i];
			minPrice = tvArray[i];
			if (maxPrice.getPrice() == 2000000) {
				maxPrice = tvArray[1];
			}
			else if (minPrice.getPrice() == 1000000) {
				minPrice = tvArray[2];
			}
		}
		System.out.println("비싼 제품 : " + maxPrice.getName());
		System.out.println("저렴한 제품 : " + minPrice.getName());

	}

}
