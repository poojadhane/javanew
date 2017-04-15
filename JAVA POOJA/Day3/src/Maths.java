
public class Maths 
{
	
	//method overloading
	int add(int n1,int n2)
	{
		return (n1+n2);
	}

	double add(double n1,int n2)
	{
		return (n1+n2);
	}

	float add(int n1,float n2)
	{
		return (n1+n2);
	}
	
	public static void main(String[] args)
	{
		Maths m =new Maths();
		System.out.println(m.add(10, 10));
		System.out.println(m.add(34.5, 2));
		System.out.println(m.add(23, 4.5f));
		
	}
}
