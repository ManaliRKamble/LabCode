//4.Write a function /method which takes variable no of int numbers as an argument and returns the sum of these arguments as an output.
public class Class3 {
	public static void sum(int...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum is=" +sum);
	}
	public static void main(String[] args) {
	
     sum(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	}

}
