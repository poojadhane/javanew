package ExceptionHandling;

public class DoctorException extends Exception 
{
	public DoctorException() {
		System.out.println("in default constructor....");
	}
	public DoctorException (String message) {
		super(message);
		
		
	}
}
