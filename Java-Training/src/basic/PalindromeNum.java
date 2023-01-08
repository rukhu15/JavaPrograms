package basic;

public class PalindromeNum {
	public static void main(String[] args) {
		int num=12344321;
		int startNum=12344321;
		int reverseNum=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			num=num/10;
			reverseNum=reverseNum*10+rem;
		}
		if(reverseNum==startNum) {
			System.out.println("Number is palindrome");
		}
		System.out.println(reverseNum);
		
	}
}
