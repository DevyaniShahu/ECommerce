package onlineshopping.java;
import java.util.Scanner;
public class customer {
	private String name;
	private String email;
	private int age;
	private double accbal;
	
	public customer()
	{
		
	}
	
	public customer(String name,String email,int age,double accbal)
	{
		this.name=name;
		this.name=email;
		this.age=age;
		this.accbal=accbal;
	}
	public void display()
	{
		   	System.out.println(this.name+ "  "+this.email+ " "+this.age+" "+this.accbal);
	}	   	
	
}
	

