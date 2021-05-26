package pack2.Batch;
import java.util.Scanner;

import pack1.Student.Student;

public class Batch {
	int batchid;
	String batchname;
	int duration;
	Scanner sc=new Scanner(System.in);
	public Batch(){};
	public Batch(int batchid,String batchname,int duration)
	{
		this.batchid=batchid;
		this.batchname=batchname;
		this.duration=duration;
	}
	public void display()
	{
		System.out.println("Batchid="+batchid);
		System.out.println("Batchname="+batchname);
		System.out.println("duration="+duration);
		
	}

}
