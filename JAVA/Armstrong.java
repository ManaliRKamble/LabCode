import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,m,i,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		n=sc.nextInt();
		temp=n;
		while(n!=0)
		{	
			m=n%10;
			sum=sum+(m*m*m);
			n=n/10;
		}
		if(temp==sum)
		System.out.println("Number is Armstrong no");
		else
			System.out.println("Not Armstrong no");
	}

}
