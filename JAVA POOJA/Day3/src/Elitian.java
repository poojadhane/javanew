import java.util.Date;


public class Elitian extends Associate
{
	private int groupid;
	private String mappedIBU;
	
	
	public Elitian(int id, String name, Date joindate,int gid,String IBU) 
	{
		super(id, name, joindate);
		this.groupid=gid;
		this.mappedIBU=IBU;
	}


	
	public String toString()
	{
	return 	super.toString()+this.groupid+" "+this.mappedIBU;
	}
	
}
