package ExceptionHandling;

import java.util.Scanner;

public class Clinic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Doctor d=new Doctor();
	
	try {
		System.out.println("Enter doctor's degree=>");
		String deg=sc.useDelimiter("\n").next();
		d.setDegree(deg);
		System.out.println("enter doctor's name");
		String nm=sc.next();
		d.setName(nm);
	} catch (DoctorException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
