package ExceptionHandling;

import java.util.Scanner;

public class Ass1 {
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
try
{
int arr[]=new int[10];
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
arr[5]=6;
arr[6]=7;
arr[7]=8;
arr[8]=9;
arr[9]=10;

System.out.println("for array");
System.out.println("Enter index number");
int idx=sc.nextInt();
System.out.println("element at entered index"+arr[idx]);
}
catch(ArrayIndexOutOfBoundsException a1)
{
	System.out.println("for array enter values from 0 to 9...");
}
}
}
