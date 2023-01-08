package Velocity;

public class FactorialOfNum {

	void findFactorialOfNum(int num) {
		int factorial=1;
		
		for(int index=1; index<=num; index++) {
			factorial=factorial*index;
		}
		System.out.println("Factorial of "+ num + ":");
		System.out.println(factorial);
	}
	
	public static void main(String[] args) {
		FactorialOfNum FactorialOfNum = new FactorialOfNum();
		FactorialOfNum.findFactorialOfNum(5);
	}
}
