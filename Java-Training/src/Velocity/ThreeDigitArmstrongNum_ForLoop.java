package Velocity;

public class ThreeDigitArmstrongNum_ForLoop {
	
	// Three digit Armstrong number
	static void checkThreeDigitAmstrongNum(int num) {
		int remainder=0;
		int sum=0;
		int originalNum=num;
		
		for(int index=0; index<num; index++) {
			remainder=num%10;
			num=num/10;
			sum+=remainder*remainder*remainder;
		}
		if(sum==originalNum) {
			System.out.println(sum);
		}
	}
	
	static void findAmstrongInRange(int num1, int num2) {
		for(int index=num1; index<num2; index++) {
			checkThreeDigitAmstrongNum(index);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("All three digit Amstrong Numbers are:");
		findAmstrongInRange(100,999);
	}	
}
