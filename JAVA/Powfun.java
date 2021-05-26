import java.util.Scanner;
public class Powfun {
	public static void main(String[] args) {
int n,p;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no n=");
n=sc.nextInt();
System.out.println("Enter power to the number=");
p=sc.nextInt();
System.out.println("Result is="+Math.pow(n, p));
}
}