
public class Book 
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	int flag=0;
	public Book() 
	{
		super();
	}
	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
		
		if(title.length()<4)
		{
			flag=1;
System.out.println("Title of the book must have atleast 4 characters");
		}
		
		if(price>=5000)
		{
			flag=1;
			System.out.println("price must be in the range 1 to 5000");
		}
		
		
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
