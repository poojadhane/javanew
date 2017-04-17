package InterfaceDemo;

public class Demo1 
{
	public static void main(String[] args) {
		
		//boxing
		int val=10;
		Integer i =new Integer(val);
		
		//unboxing
		int temp=i.intValue();
		System.out.println(temp);
	}

}
