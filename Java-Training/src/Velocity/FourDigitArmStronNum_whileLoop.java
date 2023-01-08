package Velocity;

public class FourDigitArmStronNum_whileLoop {
	
	// Four digit Armstrong Number using While loop
	void checkFourDigitAmstrongNum(int num) {
		int remainder=0;
		int sum=0;
		int originalNum=num;
		
		while(num>0) {
			remainder=num%10;
			num=num/10;
			sum+=remainder*remainder*remainder*remainder;
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
		
	public static void main(String[] args) {
		FourDigitArmStronNum_whileLoop armstrongNum=new FourDigitArmStronNum_whileLoop();
			System.out.println("All Four digit Amstrong Numbers are:");
			armstrongNum.findAmstrongInRange(1000,9999);
		}
}	
