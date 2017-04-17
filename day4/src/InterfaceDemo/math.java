package InterfaceDemo;

import java.util.Scanner;

public class math implements Operation 
{
	private float a;
	private float b;
	Scanner sc = new Scanner(System.in);
	@Override
	public void abs() 
	{
		a=sc.nextFloat();
		Math.abs(a);
		System.out.println(Math.abs(a));
		
		
	}
	@Override
	public void ceil() {
		a=sc.nextFloat();
		Math.ceil(a);
		System.out.println(Math.ceil(a));
	}
	@Override
	public void min() {
		a=sc.nextFloat();
		b=sc.nextFloat();
		Math.min(a,b);
		System.out.println(" "+Math.min(a,b));
		
	}
	@Override
	public void max() {
		a=sc.nextFloat();
		b=sc.nextFloat();
		Math.max(a,b);
		System.out.println(" "+Math.max(a,b));
		
	
	
	
	
	}
}
