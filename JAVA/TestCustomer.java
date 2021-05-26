import java.util.Scanner;
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		Customer c2=new Customer("Vijaykumar","vijay@gmail.com",29,19000);
		c1.getDetail();
		c2.getDetail();
		Scanner sc=new Scanner(System.in);
		double c;
		System.out.println("Enter new Creditlimit");
		c=sc.nextDouble();
		c2.setCreditLimit(c);
		c2.getDetail();
	}

}
