import java.util.Scanner;
public class Greatest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double no1,no2,no3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1");
		no1=sc.nextDouble();
		System.out.println("Enter no2");
		no2=sc.nextDouble();
		System.out.println("Enter no3");
		no3=sc.nextDouble();
		if(no1>no2)
		{	
			if(no1>no3)
			{
			System.out.println("No1 is greater="+no1);
			}
			else
			{
				System.out.println("No3 is greater="+no3);
			}}
		else
			{
				if(no2>no3)
				{
					System.out.println("no2 is greater="+no2);
				}
				else
				{
					System.out.println("no3 is greater="+no3);
				}
			}
		}
	}


