package Velocity;

public class FibbonacciSeries {
	
	//Find Fibonacci series 
	static void FindFibonacciSeries(int num){
		int num1=0;
		int num2=1;
		int previouNum2=0;
		System.out.println(num2);
		
		for(int index=0; index<=num; index++) {
			previouNum2=num2;
			num2=num1+num2;
			System.out.println(num2);
			num1=previouNum2;
		}
	}
	
	public static void main(String[] args) {
		FindFibonacciSeries(10);
	}
}
