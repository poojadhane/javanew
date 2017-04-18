package ExceptionHandling;

import java.util.Scanner;

public class Multiplecatch 
{
	public static void main(String[] args) 
	{
		//multiple try catch block
		Scanner sc=new Scanner(System.in);
		try
		{
		int arr[]=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		System.out.println("for array");
		System.out.println("Enter index number");
		int idx=sc.nextInt();
		System.out.println("element at entered index"+arr[idx]);
		
	
		String str="Pooja";
		System.out.println("for string");
		System.out.println("Enter index number");
		idx=sc.nextInt();
		System.out.println("character at entered index"+str.charAt(idx));
		}
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("for string :please enter values from 0 to 5");
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("for array enter values from 0 to 3...");
		}
		catch(Exception e)
		{
			System.out.println("enter valid value");
		}
		/*System.out.println("Enter the numerator");
		int num=sc.nextInt();
		System.out.println("Enter the denominator");
		int den=sc.nextInt();
		try
		{
			float ans=num/den;
			System.out.println("Ans is"+ans);
		}
		catch(Throwable a)
		{
			System.out.println("please enter non zero value for denominator");
		}*/

	}
}
