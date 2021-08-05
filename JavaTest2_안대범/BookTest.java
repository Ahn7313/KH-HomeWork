package ncs.test7;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] bookArray = new Book[5];
		
		bookArray[0] = new Book("IT",  "SQL PLUS", 50000, 0.05);
		bookArray[1] = new Book("IT",  "Java 2.0", 40000, 0.03);
		bookArray[2] = new Book("IT",  "JSP Servlet", 60000, 0.06);
		bookArray[3] = new Book("Noble",  "davinchCode", 30000, 0.1);
		bookArray[4] = new Book("Noble",  "cloven Hoof", 50000, 0.15);
		
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println(bookArray[i].toString());
		}
		System.out.println();
		
		int sum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			sum += bookArray[i].getBookprice();
		}
		System.out.println("sum = " + sum);

	}

}
