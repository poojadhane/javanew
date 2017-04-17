package InterfaceDemo;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		
		//string class is immutable
		String s="Tom";
		System.out.println(s.hashCode());
		s=s.concat("Jerry");
		System.out.println(s.hashCode());
		System.out.println(s.equals(s));

		
		//string buffer is mutable
		StringBuffer sb1=new StringBuffer("Tom");
		System.out.println(sb1.hashCode());
		sb1=sb1.append("jerry");
		System.out.println(sb1.hashCode());
		
		//string builder is mutable
		StringBuilder sb2 =new StringBuilder("tom");
		System.out.println(sb2.hashCode());
		sb2=sb2.append("Jerry");
		System.out.println(sb2.hashCode());



	}
}
