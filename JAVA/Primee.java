import java.util.Scanner;
public class Primee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		i=sc.nextInt();
		if(i==1)
		{
			System.out.println("Not prime not composite");
		}
		else
			if(i%2==0)
				System.out.println("No is not prime "+i);
			else
				System.out.println("No is prime");
	}

}
