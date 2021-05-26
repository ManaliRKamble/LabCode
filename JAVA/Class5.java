//7:Write a java program to convert char array into String.
public class Class5 {

	public static void main(String[] args) {
		char[] a= {'m','a','n','a','l','i'};
		String name=String.copyValueOf(a);
		System.out.println("String is="+name);
	}

}
