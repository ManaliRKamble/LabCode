
public class Compound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p=20000,r=0.06;
		int t=3,n=12;
		double A,c;
		//A=(20000(1+(6/100)))*3;
		A=p*Math.pow(1+ (r / n), n*t);
		System.out.println("Amount:"+A);
		c=A-p;
		System.out.println("Compound interest after "+t+" years:"+c);
	}

}
