package array;

public class StringMethods {
	static int [] arr = {1,3,5,6};
	
	
	public static void main(String[] args) {
		int a =arr.length;
		String str1="Velocity";
		String str2="Rukhmini";
		int len = str1.length();
		str1=str1.concat(str2);
		
		System.out.println(str1);
		char b=str1.charAt(2);
		System.out.println(b);
		System.out.println(str2.charAt(6));
		
	}
}
