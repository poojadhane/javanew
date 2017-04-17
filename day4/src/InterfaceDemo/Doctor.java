package InterfaceDemo;

import java.util.Scanner;

public class Doctor implements MyInterface
{
	private String degree;
	private String name;
	Scanner sc = new Scanner(System.in);
	@Override
	
	public void getData() 
	{
		this.degree=sc.next();
		this.name=sc.next();
		
	}
	
	@Override
	public void putData()
	{
		System.out.println(" degree is"+this.degree);
		System.out.println(" name is "+this.name);
		
	}
	
}
