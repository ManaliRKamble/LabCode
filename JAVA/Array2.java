//2:Write a Java program to accept 2D aaray elements.Display all elements.
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
	
		System.out.println("Enter 9 numbers in Array");
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
	
		}

}
