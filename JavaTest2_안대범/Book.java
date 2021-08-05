package ncs.test7;

public class Book {
	//필드생성
	private String category;
	private String bookname;
	private double bookprice;
	private double bookDiscountRate;
	//기본생성자
	public Book() {
		super();
	}
	//매개변수생성자
	public Book(String category, String bookname, double bookprice, double bookDiscountRate) {
		super();
		this.category = category;
		this.bookname = bookname;
		this.bookprice = bookprice;
		this.bookDiscountRate = bookDiscountRate;
	}
	//getter setter
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	public String toString() {
		return "Category = " + category + ", Bookname = " + bookname +
				", Price = " + bookprice + ", DiscountRate = " + bookDiscountRate;
	}
	
}
