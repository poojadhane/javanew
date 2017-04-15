import java.util.Scanner;


public class TestEmp 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	
	Employee e1 =new Employee();
	 /*e1.setEmpid(11);
	  e1.setEmpname("pooja");
	  e1.setSalary(20000);
	System.out.println(e1.getEmpid());
	System.out.println(e1.getEmpname());
	System.out.println(e1.getSalary());
 */
	System.out.println("how many emp are there");
	int num_of_emp=s.nextInt();
	Employee earr[]=new Employee[num_of_emp];
	for (int i = 0; i <earr.length; i++)
	{
		earr[i]=new Employee();
		System.out.println("Enter data");
		System.out.println("Enter empid");
		earr[i].setEmpid(s.nextInt());
		System.out.println("Enter empname");
		earr[i].setEmpname(s.next());
		System.out.println("Enter salary");
		earr[i].setSalary(s.nextInt());
		
		
	}	
for (int i = 0; i < earr.length; i++) {
	earr[i].show();
}
}
}
