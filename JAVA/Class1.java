//1:Write a function to accept array of string.Display all elements in uppercase.
import java.util.Scanner;
public class Class1 {
	public static void Name()
	{
		Scanner sc=new Scanner(System.in);
		String[] name=new String[5];
		int i;
		System.out.println("Enter names");
		for(i=0;i<name.length;i++)
		{
			name[i]=sc.next();
		}
		for(i=0;i<name.length;i++)
		{
			System.out.println(name[i].toUpperCase());
		}
	}
	public static void main(String[] args) {
	
	Name();

	}

}
