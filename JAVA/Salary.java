import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		int basic;
		double hra=1,da = 1;
		double gs;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary amount");
        basic=sc.nextInt();
	    if(basic<=10000)
	    {
	    	hra=0.20*basic;
	    	da=0.80*basic;
	    }
	    else if(basic<=20000)
	    {
	    	hra=0.25*basic;
	    	da=0.90*basic;
	    }
	    else if(basic>20000)
	    {
	    	hra=0.25*basic;
	    	da=0.90*basic;
	    }
	gs=basic+hra+da;
	System.out.println("Gross salary is="+gs);
	
	}
      
}
