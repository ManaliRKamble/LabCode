package pack1.Student;
import java.util.Scanner;
public class Student {
	public static final int toTalmark = 50;
	public int rollno;
	public String name;
	private String grade;
	int totalMark;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter rollno=");
		rollno=sc.nextInt();
		System.out.println("Enter name=");
		name=sc.next();
		System.out.println("Enter grade");
		grade=sc.next();
	}
 
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void display()
	{
		System.out.println("rollno="+rollno);
		System.out.println("Name="+name);
		System.out.println("grade="+grade);
	}
}



