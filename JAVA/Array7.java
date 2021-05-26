import java.util.Scanner;
public class Array7 {

	public static void main(String[] args) {
		int n,i,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number you want?");
		n=sc.nextInt();
		System.out.println("Enter array elements");
		int[] arr=new int[n];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter no to search");
		k=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(k==arr[i])
				break;
		}
		if(i!=arr.length)
		  System.out.println("No found at index="+i);
		else
			System.out.println("Number not exist");
	}

}
