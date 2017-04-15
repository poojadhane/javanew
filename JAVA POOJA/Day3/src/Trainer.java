
public class Trainer  extends Person{

	private int num_of_skills;
	private int expinyrs;
	
	public Trainer(String fname, String lname, String address,int skills,int exp) {
		super(fname, lname, address);
		this.num_of_skills=skills;
		this.expinyrs=exp;
		
		
	}

	@Override
	public void showdetails() 
	{
		System.out.println(this.getFname());
		System.out.println(this.getLname());
		System.out.println(this.getAddress());
		System.out.println(this.num_of_skills);
		System.out.println(this.expinyrs);
		
		
	}
	public void trainermethod()
	{
		
	}

}
