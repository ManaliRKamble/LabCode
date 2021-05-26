import java.util.Scanner;
public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n,i,max=0,min=0;
		
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter array elements");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		min=arr[0];
		max=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Max no is="+max);
		System.out.println("Min no is="+min);
	}

}
