import java.util.*;
import java.util.Scanner;
public class Arrays1 {

	public static void main(String[] args) {
		int i;
		int[] arr=new int[5];
		System.out.println("Enter 5 array elements");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are=");
		for(i=0;i<arr.length;i++)
			System.out.println(arr[i]);
				

	}

}
