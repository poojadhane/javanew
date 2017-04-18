package ExceptionHandling;

public class Customer 
{
	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String custNo, String custName, String category) throws InvalidInputException 
	{
		super();
		//if(custNo.startsWith("c")||custNo.startsWith("C")&&custName.length()==4&&category.equals("platinum")||category.equals("gold")||category.equals("silver"))
		if(custNo.startsWith("c")||custNo.startsWith("C"))
		{
		this.custNo = custNo;
		}
		else
		{
			throw new InvalidInputException("invalid input...."); 
		}
		if(custName.length()==4)
		this.custName=custName;
		else
			throw new InvalidInputException("invalid input...."); 
		if(category.equals("gold")||category.equals("platinum")||category.equals("silver"))
				this.category=category;   
		else
			throw new InvalidInputException("invalid input...."); 
		
		
	}

	public String getCustNo() {
		return custNo;
	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName
				+ ", category=" + category + "]";
	}

	public String getCustName() {
		return custName;
	}

	public String getCategory() {
		return category;
	}

}
