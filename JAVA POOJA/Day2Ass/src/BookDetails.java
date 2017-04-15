import java.util.Scanner;


public class BookDetails
{
public static void main(String[] args) 
{
	//Scanner sc=new Scanner(System.in);
	/*System.out.println("Enter book id");
	int bookid=sc.nextInt();
	System.out.println("Enter book author");
	String bookauthor=sc.next();
	System.out.println("Enter book price");
	int bookprice=sc.nextInt();
	System.out.println("Enter booktitle");
	String booktitle=sc.next();*/
	Book b=new Book(11,"poo","pooja",7000);
/*	b.setBookNo(bookid);
	b.setAuthor(bookauthor);
	b.setPrice(bookprice);
	b.setTitle(booktitle);*/
	//b.display();
	/*System.out.println(b.getBookNo());
	System.out.println(b.getAuthor());
	System.out.println(b.getPrice());
	System.out.println(b.getTitle());
	*/
	System.out.println(b);
}
}
