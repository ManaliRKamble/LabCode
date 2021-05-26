//6:Write a java program to sort array.
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n,i,s=0,k,j,temp;
		System.out.println("Enter how many number you want?");
		n=sc.nextInt();
		System.out.println("Enter array2 elements");
		int[] ar=new int[n];
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();

		}
		for(i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}

	    for(i=0;i<n;i++)
	    {
	    	for(j=i+1;j<n;j++)
	    	{
	    		if(ar[i]>ar[j])
	    		{
	    			temp=ar[i];
	    			ar[i]=ar[j];
	    			ar[j]=temp;
	    		}
	    	}
	   
	    }
	    for(i=0;i<ar.length;i++)
	    {
	    System.out.println(ar[i]);
	}
	}

}
