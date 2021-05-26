import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rev=0,m,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		n=sc.nextInt();
		System.out.println("no is="+n);
		p=n;
		while(n!=0)
		{
			m=n%10;
			rev=(rev*10)+m;
			n=n/10;
		}
		if(p==rev)
			System.out.println("Palindrome no");
		else
			System.out.println("Not palindrome");
	}

}
