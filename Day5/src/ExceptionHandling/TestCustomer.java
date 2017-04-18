package ExceptionHandling;

import java.util.Scanner;

public class TestCustomer 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	try {
		Customer c=new Customer(sc.next(),sc.next(),sc.next());
		System.out.println(c);
	} catch (InvalidInputException e) {
		
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
}
}
