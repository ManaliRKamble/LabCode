import java.util.Scanner;
public class Switchh {

	public static void main(String[] args) {
		int choice,q,n=20,s=5,b=30,c=50,p=10,total=0,total1=0,total2=0,total3=0,total4=0;
		boolean flag=true;
		double gt;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Pen");
		System.out.println("2.Pencil");
		System.out.println("3.Notebook");
		System.out.println("4.Bottle");
		System.out.println("5.ColorBox");
		System.out.println("6.Exit");
		//choice=sc.nextInt();
		while(flag!=false)
		{
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1 :
					System.out.println("Enter quantity");
					q=sc.nextInt();
					total=q*p;
					System.out.println("Quantity="+q);
					System.out.println("Price="+p);
					System.out.println("Total="+total);
					break;
				case 2:	  
					System.out.println("Enter quantity");
					q=sc.nextInt();
					
					total1=q*s;
					System.out.println("Quantity="+q);
					System.out.println("Price="+s);
					System.out.println("Total="+total1);
					break;
				case 3:
					System.out.println("Enter quantity");
					q=sc.nextInt();
					
					total2=q*n;
					System.out.println("Quantity="+q);
					System.out.println("Price="+n);
					System.out.println("Total="+total2);
					break;
				case 4:
					System.out.println("Enter quantity");
					q=sc.nextInt();
					
					total3=q*b;
					System.out.println("Quantity="+q);
					System.out.println("Price="+b);
					System.out.println("Total="+total3);
					break;
				case 5:
					System.out.println("Enter quantity");
					q=sc.nextInt();
					total4=q*c;
					System.out.println("Quantity="+q);
					System.out.println("Price="+c);
					System.out.println("Total="+total4);
				break;
				
				case 6:
					flag=false;
					System.out.println("Terminating application and calculating grand total...");
					break;
					//default:
						//5System.out.println("Enter correct choice");
					
			
			}
			
			
		}
		
		gt=total+total1+total2+total3+total4;
		System.out.println("Grand total is="+gt);
		
	}

}
