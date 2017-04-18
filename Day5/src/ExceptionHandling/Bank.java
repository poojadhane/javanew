package ExceptionHandling;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		try {
			Account a=new Account(sc.next(),sc.next());
			System.out.println(a);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		
		/*try 
		{
			a.setAccId(sc.next());
		} 
		catch (AccountException e) 
		{

			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		a.setAcctype(sc.next());
		System.out.println(a);*/

	}
}
