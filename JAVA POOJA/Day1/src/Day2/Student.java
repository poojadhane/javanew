package Day2;

public class Student 
{
	//data members
	private int rollno;
	private String name;
	
	//default constructor
	public Student()
	{
		System.out.println("in default constructor");
	}
	//parametrized constructor
	public Student(int roll,String nm)
	{
		rollno=roll;
		name=nm;
	}
	int getRollno()
	{
		return rollno;
	}
	String getName()
	{
		return name;
		
	}
	public void showStud()
	{
		System.out.println("RollNo:" +rollno+"\nName:" +name);
		
	}
}

