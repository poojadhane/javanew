
public class Ass3
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	private static int bookCount;
	int flag=0;
	public Ass3() 
	{
		super();
		bookCount++;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public static void showcount()
	{
		System.out.println("no of objects created "+bookCount);
	}
	
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author="
				+ author + ", price=" + price + "]";
	}
	
	/*public void display()
	{
		if(flag==0)
		{
		System.out.println("book no"+bookNo+"book Title"+title+"bookauthor"+author+"price"+price);
	}*/
	 
	
	

}
