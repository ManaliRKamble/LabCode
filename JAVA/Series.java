import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n,sum=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter n value");
         n=sc.nextInt();
         sum=(n*(n+1))/2;
         System.out.println("Sum="+sum);
	}

}
