
public class Customer 
{
	private String custId;
	private String custName;
	private int custMobile;
	private static int count;

	static
	{
		System.out.println("in static block....");
		count=0;
	}

	public Customer() {
		super();
		count++;
		System.out.println("in default constructor");
	}

	public Customer(String custId, String custName, int custMobile) 
	{
		super();
		count++;
		System.out.println("in para constructor");
		this.custId = custId;
		this.custName = custName;
		this.custMobile = custMobile;
	}

	public static void showcount()
	{
		System.out.println("no of objects created "+count);
	}
	public void showCustDetails()
	{

		System.out.println(this.custId);
		System.out.println(this.custName);
		System.out.println(this.custMobile);

	}



}
