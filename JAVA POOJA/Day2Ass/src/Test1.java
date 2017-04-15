import java.util.Scanner;


public class Test1 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter book id");
		int bookid=sc.nextInt();
		System.out.println("Enter book author");
		String bookauthor=sc.next();
		System.out.println("Enter book price");
		int bookprice=sc.nextInt();
		System.out.println("Enter booktitle");
		String booktitle=sc.next();
		Ass3 b=new Ass3();
		b.setBookNo(bookid);
		b.setAuthor(bookauthor);
		b.setPrice(bookprice);
		b.setTitle(booktitle);
		Ass3.showcount();
		//b.display();
		System.out.println(b.getBookNo());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
		System.out.println(b.getTitle());
}
}
