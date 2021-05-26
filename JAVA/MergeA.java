//5:Write a program to  merge two arrays into a single array.
import java.util.Scanner;
public class MergeA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,n1,i,k;
		
		System.out.println("Enter how many number you want?");
		n=sc.nextInt();
		System.out.println("Enter array1 elements");
		int[] arr=new int[n];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		
		System.out.println("Enter how many number you want?");
		n1=sc.nextInt();
		System.out.println("Enter array2 elements");
		int[] ar=new int[n1];
		
		
		int[] c=new int[n+n1];
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();

		}
		int pos=0;
		for(i=0;i<arr.length;i++)
		{
			c[i]=arr[i];
			pos++;
		}
		for(i=0;i<ar.length;i++)
		{
			c[i+pos]=ar[i];

		}
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
	}

}
