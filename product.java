package onlineshopping.java;
import java.util.Scanner;
public class product {
	private int pid;
	private String name;
	private double price;
	private double stock;
	
	public product()
	{
		
	}
	
	public product(int pid,String name,double price,double stock)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
		this.stock=stock;
	}
	public void display()
	{
		   	System.out.println(this.pid+ "  "+this.name+ " "+this.price+" "+this.stock);
	}	   	
	
}
