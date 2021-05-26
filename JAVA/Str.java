import java.util.Scanner;
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String c;
		System.out.println("Enter A");
		String A=sc.next();
		
		System.out.println("Enter B");
		String B=sc.next();
		System.out.println(A+" "+B);
		c=A.substring(0, 1).toUpperCase()+A.substring(1,A.length());
		System.out.println(c);
	}

}
