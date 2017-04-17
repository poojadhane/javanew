package InterfaceDemo;

public class Employee 
{
	private int emp_id;
	private String emp_name;

	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + emp_id;
		result = prime * result + ((emp_name == null) ? 0 : emp_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (emp_id != other.emp_id)
			return false;
		if (emp_name == null) {
			if (other.emp_name != null)
				return false;
		} else if (!emp_name.equals(other.emp_name))
			return false;
		return true;
	}

*/
public boolean equals(Object obj)
{
	Employee e1=(Employee)obj;
	
	//Employee e1=(Employee)obj;
	if(this.emp_name==e1.emp_name)
		System.out.println(true);
	else
		System.out.println(false);
	if(this.emp_id==e1.emp_id)
		return true;
	else
	return false;
	
}


	public static void main(String[] args) 
	{
		Employee e1=new Employee(11,"pooja");
		Employee e2=new Employee(11,"pooj");
		if(e1.equals(e2))
		{
			System.out.println("string are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
	}
}


