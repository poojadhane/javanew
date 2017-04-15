import java.util.Date;

public class TestInheritance {

	public static void main(String[] args) 
	{
		Date d=new Date((2017-1900),04,14);
		Associate a = new Associate(10 ,  " pooja ",d);
		//a.showData();
		System.out.println(a);
		
		Elitian e =new Elitian(23, "poo", d, 2017, "TUS-05");
		System.out.println(e);

	}

}
