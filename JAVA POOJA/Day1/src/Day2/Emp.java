package Day2;

public class Emp 
{
	private int empid;
	private String empname;
	private int salary;
	
	public Emp() {
		super();
	}
	public Emp(int empid, String empname, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	public void showDetails()
	{
		System.out.println("empid is "+empid+"\n empname"+empname+"\nsalary is"+salary);
	}
	
	
}
