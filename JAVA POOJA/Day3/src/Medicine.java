import java.util.Date;


public abstract class Medicine 
{
	public static int length;
	private int price;
	private Date expiry_date;
	
	
	public int getPrice() {
		return price;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void getDetails()
	{
		System.out.println("the price is"+price+"expiry date is"+expiry_date);
	}
	
	public abstract void displayLabel(); 
}
