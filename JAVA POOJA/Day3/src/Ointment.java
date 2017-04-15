
public class Ointment extends Medicine
{

	@Override
	public void displayLabel() 
	{
		System.out.println(this.getPrice());
		System.out.println(this.getExpiry_date());
		System.out.println("for external use only");
		
	}

}
