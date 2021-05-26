import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n,exp,result=1,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      n=sc.nextInt();
      System.out.println("n="+n);
      System.out.println("Enter power of no");
      exp=sc.nextInt();
      System.out.println("Exp="+exp);
      //i=exp //i=2
     while(exp!=0)
      {
    	 result=result*n; //1=1*5=5     5=5*5=25
    	 exp--;
    	  
      }
      System.out.println("result :"+result);
	}

}
