import java.util.Scanner;
public class Addtype {

	public static void add1(int a,double b)
	{
	
		System.out.println("Addition is="+(a+b));
	}
	public static void add1(int a,float b)
	{
		System.out.println("Addition is="+(a+b));
	}
	public static void add1(int a,double b,float c)
	{
		System.out.println("Addition is="+(a+b+c));
	}
	
	public static void main(String[] args) {
		
		
		int x=10;
		double y=2.5;
		float z=6;
		add1(x,y);
		add1(x,z);
		add1(x,y,z);
	}	
	

}
