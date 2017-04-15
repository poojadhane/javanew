
public class Syrup extends Medicine
{

	@Override
	public void displayLabel() {
	
		System.out.println(this.getPrice());
		System.out.println(this.getExpiry_date());
	}

}
