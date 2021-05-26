//3:Write a java program to make the addition of two 2D array And store result in Third array.
import java.util.Scanner;

public class Arrayadd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
	
		System.out.println("Enter 9 numbers in first Array");
		int[][] arr=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
						
			}
		}
		System.out.println("Entered 3*3 array is");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
						
			}
			System.out.println(" ");
		}
		System.out.println("Enter 9 numbers in second Array");
		int[][] ar=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
						
			}
		}
		System.out.println("Entered 3*3 array is");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(ar[i][j]+" ");
						
			}
			System.out.println(" ");
		}
		int[][] a=new int[3][3];
		System.out.println("Addition of array is=");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				
				a[i][j]=arr[i][j]+ar[i][j];		
			}
			System.out.println(" ");
		}
		System.out.println("Addition of Array is=");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"    ");
						
			}
			System.out.println("   ");
		}
	}
	

}
