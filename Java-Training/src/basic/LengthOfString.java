package basic;

public class LengthOfString {
	
	static void findLength(String input) {
		String temp="";
		int index=0;
		int count=1;
		while(temp =="") {
			temp="" +input.charAt(index);
			index++;
			count++;
		}
		System.out.println(count);
		System.out.println(index);
	}
	public static void main(String[] args) {
		findLength("Rukhmini");
	}
}
