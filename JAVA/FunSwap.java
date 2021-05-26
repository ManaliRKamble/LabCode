
import java.util.Scanner;
public class FunSwap {
    
	public static void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("A is="+a);
		System.out.println("B is="+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1");
		no1=sc.nextInt();
		System.out.println("Enter no2");
		no2=sc.nextInt();
		swap(no1,no2);

	}

}
