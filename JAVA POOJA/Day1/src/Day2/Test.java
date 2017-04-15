package Day2;

public class Test 
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		//s1.showStud();
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());

		Student s2=new Student(9,"pooja");
		//s2.showStud();
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());
	}
}
