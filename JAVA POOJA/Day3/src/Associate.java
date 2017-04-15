import java.util.Date;


public class Associate 
{
	private int id;
	private String name;
	private Date joindate;
	
	
	public Associate(int id, String name, Date joindate) 
	{
		super();
		this.id = id;
		this.name = name;
		this.joindate = joindate;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getJoindate() {
		return joindate;
	}

	@Override
	public String toString() {
		return "Associate [id=" + id + ", name=" + name + ", joindate="
				+ joindate + "]";
	}

	
	
	
}
