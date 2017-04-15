
public class Tablet extends  Medicine
{

	@Override
	public void displayLabel() 
	{
		System.out.println(this.getPrice());
		System.out.println(this.getExpiry_date());
		System.out.println("store in cool place");
		
	}

}
