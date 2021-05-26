import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Enter size of array");
		n = sc.nextInt();

		int[] arr = new int[n];
		int i, max, min, sum = 0, avg = 1;

	//	System.out.println("Array length"+arr.length);
		
		
		System.out.println("Enter Array Elements");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		min = arr[0];
		for (i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			avg = sum / n;
		}
		for (i = 0; i < arr.length; i++) {
			if (max < arr[i])

				max = arr[i];
		}
		for (i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];

		}
		System.out.println("Max no is=" + max);
		System.out.println("Min no is=" + min);
		System.out.println("Sum of no is=" + sum);
		System.out.println("Avg of no is=" + avg);
	}

}
