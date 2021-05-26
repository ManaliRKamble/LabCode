import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
		
		int i,n,evensum=0,oddsum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(n%2==0)
			{
				evensum=evensum+i;
			}
			else
			{
				oddsum=oddsum+i;
			}
		}
		System.out.println("Sum of Even="+evensum);
		System.out.println("Sum of Odd="+oddsum);

	}

}
