import java.util.*;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int rollno;
     String name;
     int sub1,sub2,sub3,sub4,sub5;
     float Total,per;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter roll no");
     rollno=sc.nextInt();
     sc.nextLine();
     System.out.println("Enter name");
     name=sc.nextLine();
     System.out.println("Enter subject1 mark");
     sub1=sc.nextInt();
     System.out.println("Enter subject2 mark");
     sub2=sc.nextInt();
     System.out.println("Enter subject3 mark");
     sub3=sc.nextInt();
     System.out.println("Enter subject4 mark");
     sub4=sc.nextInt();
     System.out.println("Enter subject5 mark");
     sub5=sc.nextInt();
     Total=sub1+sub2+sub3+sub4+sub5;
     per=Total/5;
     System.out.println("-----------------------------------------");
     System.out.println("roll no="+rollno);
     System.out.println("Name="+name);
     System.out.println("Mark of Sub=1="+sub1);
     System.out.println("Mark of sub2="+sub2);
     System.out.println("Mark of sub3="+sub3);
     System.out.println("Mark of sub4="+sub4);
     System.out.println("Mark of sub5="+sub5);
     System.out.println("Total="+Total);
     
     
     if(per>75)
    	 System.out.println("A grade");
     else if(per<74 && per>60)
    	 System.out.println("B grade");
     else
    	 System.out.println("C grade");
	
     System.out.println("Percentage="+per);
	}

}
