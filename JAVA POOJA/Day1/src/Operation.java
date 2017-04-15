
public class Operation 
{
public static void main(String args[])
{

	int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);
	char c=args[2].charAt(0);
	
	switch(c)
	{
	case '+':
		System.out.println("Addition is n1 and n2"+(n1+n2));
		break;
	
	case '-':
		System.out.println("Addition is n1 and n2"+(n1-n2));
		break;
		
	case '*':
		System.out.println("Addition is n1 and n2"+(n1*n2));
		break;
		
	case '/':
		System.out.println("Addition is n1 and n2"+(n1/n2));
		break;
		
		default:
			System.out.println("Please enter '+' ,'-','*','/'  ");
	}
	
}
}
