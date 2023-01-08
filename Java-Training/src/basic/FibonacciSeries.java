package basic;
import java.util.*;
public class FibonacciSeries {
	
	void getFibonacciSeries(int input) {
		int count=0;
		int num1=0;
		int num2=1;
		for(int index=1; index<input; index++) {
			num2=num1+num2;
			num1=num2-num1;
			if(num2>=1) {
			count++;
			if(count<= 20)
			System.out.println(num2);
			}		
		}
	}
	
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.getFibonacciSeries(70);
	}
}
