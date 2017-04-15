import java.util.Scanner;


public class TestBook3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Book3[] b=new Book3[3];
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter book no");
				int bookno=sc.nextInt();
			System.out.println("Enter title");
			String title=sc.next();
			System.out.println("Enter author");
			String author=sc.next();
			System.out.println("Enter price");
			int price=sc.nextInt();
			
			b[i].setBookNo(bookno);
			b[i].setTitle(title);
			b[i].setAuthor(author);
			b[i].setPrice(price);
			
			System.out.println(b.toString());
			System.out.println();
		}
		
	}
}
