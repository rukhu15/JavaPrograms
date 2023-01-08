package Velocity;

public class EvenOddNum {
	
	void CheckEvenOrOddNum(int num) {
		if(num%2==0) {
			System.out.println(num + " is Even Number");
		}
		else {
			System.out.println(num + " is Odd Number");
		}
	}
	
	public static void main(String[] args) {
		EvenOddNum evenOddNum =new EvenOddNum();
		evenOddNum.CheckEvenOrOddNum(12);
		evenOddNum.CheckEvenOrOddNum(13);
	}
}
