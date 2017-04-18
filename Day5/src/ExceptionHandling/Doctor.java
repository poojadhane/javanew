package ExceptionHandling;

import java.util.Scanner;

public class Doctor 
{
	private String degree;
	private String name;
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree1) throws DoctorException 
	{
		if(degree1.isEmpty()||degree1.length()<0||degree1.equals(null))
			throw new DoctorException();
		else
			this.degree = degree1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{

		this.name = name;
	}
	@Override
	public String toString() {
		return "Doctor [degree=" + degree + ", name=" + name + "]";
	}



}
