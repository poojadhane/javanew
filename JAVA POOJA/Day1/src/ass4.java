import java.util.Scanner;

public class ass4 
{
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	int n1=Integer.parseInt(args[0]);
	if(n1>=1 && n1<=50)
	{
		int arr[]=new int[5];
		System.out.println("Enter 5 numbers");
		for(int i=0;i<arr.length;i++)
		{
				arr[i]=sc.nextInt();
				if(arr[i]<1 && arr[i]>50)
				{
					System.out.println("Enter numbers between 1 to 50");
					break;
				}
		}
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n1);
			{
				flag=1;
				System.out.println("bingo");
			}
		}

		if(flag==0)
		{
			System.out.println("number not present");
		}
	}
	else
	{
		System.out.println("number invalid");
	}
		
	}

	
	
	}
	
	
