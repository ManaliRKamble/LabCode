import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=0;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
	int	n=sc.nextInt();
		for(int p=1;p<=n;p++)
		{
		if(p==1)
		{
			System.out.println("1 is Not prime not composite");
		}
		else
			for(i=2 ;i<p;i++)
			{
			if(p%i!=0)
			{
				flag=false;
				//System.out.println("No is not prime "+i);
			}
				else {
				flag=true;
				break;
				}
		}
		if(flag==false)
		{System.out.println("prime :"+p);
			}
		}
	}

}
