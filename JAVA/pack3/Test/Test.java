package pack3.Test;

import pack1.Student.Student;
import pack2.Batch.Batch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1=new Student();
    s1.accept();
    s1.display();
    
    s1.setName("Manali");
    System.out.println("Modified name of student 1 : "+s1.getName());
    Batch b1=new Batch(12,"JAVA",8);
    b1.display();
    Batch b2=new Batch();
   
	}
}