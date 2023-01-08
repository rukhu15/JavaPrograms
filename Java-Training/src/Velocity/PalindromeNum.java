package Velocity;

public class PalindromeNum {
	// All Palindrome Numbers between 1 to 200
	// Check 123321 is palindrome or not
	void checkPalindromeNum(int num) {
		int remainder=0;
		int rev=0;
		int originalNum=num;
		while(num>0) {
			remainder=num%10;
			num=num/10;
			rev=rev*10+remainder;
		}
		if(rev==originalNum) {
			System.out.println(rev);
		}
	}
	
	public static void main(String[] args) {
		PalindromeNum palindromeNum = new PalindromeNum();
		int num = 200;
		System.out.println("Palindrome numbers are");
		for(int index=1; index<num; index++) {
			palindromeNum.checkPalindromeNum(index);
		}
		palindromeNum.checkPalindromeNum(123321);
	}
}
