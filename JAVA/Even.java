

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated messssshod stub

		int i,n,evensum=0,oddsum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(i%2==0)
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

