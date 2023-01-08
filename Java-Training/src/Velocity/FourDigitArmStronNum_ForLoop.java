package Velocity;

public class FourDigitArmStronNum_ForLoop {

	// Four digit Armstrong Number using While loop
	void checkFourDigitAmstrongNum(int num) {
		int remainder=0;
		int sum=0;
		int originalNum=num;
		
		for(int index=0; index<=num; index++) {
			remainder=num%10;
			num=num/10;
			sum+=remainder*remainder*remainder*remainder;
		}
		if(num>0) {
			sum+=num*num*num*num;
		}
		if(sum==originalNum) {
			System.out.println(sum);
		}
	}
		
	void findAmstrongInRange(int num1, int num2) {
		for(int index=num1; index<num2; index++) {
			checkFourDigitAmstrongNum(index);
		}	
	}
	
	static void findDigitsInNum(int num){
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
		
	public static void main(String[] args) {
		FourDigitArmStronNum_ForLoop armstrongNum=new FourDigitArmStronNum_ForLoop();
			System.out.println("All Four digit Amstrong Numbers are:");
			armstrongNum.findAmstrongInRange(1000,9999);
			findDigitsInNum(1634);
	}	
}
