
public class Customer {
	String name;
	String email;
	int age; 
	double creditLimit;
	Customer()
	{
		String name="Riya";
		System.out.println("Customer Name="+name);
		String email="riya@gmail.com";
		System.out.println("Email="+email);
		age=25;
		System.out.println("Age="+age);
		creditLimit=10000;
		System.out.println("CreditLimit="+creditLimit);
	}
	Customer(String name,String email,int age,double creditLimit)
	{
		this();
		this.name=name;
		this.email=email;
		this.age=age;
		this.creditLimit=creditLimit;
	}
	public void getDetail()
	{
		System.out.println("Customer name="+name);
		System.out.println("Creditlimit="+creditLimit);
	}
	public void setCreditLimit(double newCredit)
	{
		creditLimit=newCredit;
	}
	public double getCreditLimit()
	{
		return creditLimit;
	}
	
}
