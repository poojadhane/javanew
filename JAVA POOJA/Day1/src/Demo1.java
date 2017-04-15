public class Demo1
{
	public static void main(String args[])
	{
		
		int n1=Integer.parseInt(args[0]);
		System.out.println("numbers between 1 and "+n1);
		for (int i= 1; i <= n1; i++)
			if(i%2==0)
			{
				System.out.println(i +" ");
			}
		}
	}

