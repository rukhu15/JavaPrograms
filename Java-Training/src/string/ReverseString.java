package string;

 public class ReverseString {
	 static void makereverse(String name) {
		int length = name.length();
		char ch=' ';
		String s="";
		boolean flag = Character.isDigit(ch);
		System.out.println(flag);
		System.out.println(flag);
		for(int i=length-1; i>=0; i--) {
			ch = name.charAt(i);
			s+=ch;
		
		}
		System.out.println(s);
		
		
	}
	 void checkPalindrome() {
		 
	 makereverse("rukhmini");
	 }
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.checkPalindrome();
	}
}
