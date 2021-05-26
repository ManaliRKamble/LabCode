import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i,j,temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no1");
      i=sc.nextInt();
      System.out.println("Enter no2");
      j=sc.nextInt();
      temp=i;
      i=j;
      j=temp;
      System.out.println("no1:"+i);
      System.out.println("no2:"+j);
      
	}

}
