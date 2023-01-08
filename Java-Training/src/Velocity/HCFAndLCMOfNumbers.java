package Velocity;

public class HCFAndLCMOfNumbers {
	static int HCF=0;

	static void findHCF(int num1,  int num2) {
		int remainder=1;
		int OriginalNum2=num2;
		
		while(remainder>0) {
			remainder=num1%num2;
			num1=num2;
			if(remainder != 0)
			num2=remainder;
		}
		HCF=num2;
		System.out.println("HCF of "+num1 + " and " + OriginalNum2 + " = "  + HCF);
	}
	
	 void findLCM(int num1, int num2) {
		int LCM=(num1*num2)/HCF;
		System.out.println("LCM of "+num1 + " and " + num2 + " = " +LCM);
	}
	
	static void findGreaterNum(int num1, int num2) {
		int greaterNum =0;
		int smallerNum=0;
		if(num1>num2) {
			greaterNum=num1;
			smallerNum=num2;
		}
		else {
			greaterNum=num2;
			smallerNum=num1;
		}
		findHCF(greaterNum,smallerNum);
		
	}
	public static void main(String[] args) {
		HCFAndLCMOfNumbers h= new HCFAndLCMOfNumbers();
		findHCF(8,12);
		h.findLCM(8,12);
	}
}
