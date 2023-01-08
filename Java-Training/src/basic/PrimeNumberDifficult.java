package basic;

import java.util.Scanner;

public class PrimeNumberDifficult {
	static int count;
	static int sum;
	static int maxNum;
	void isPrimeNumber(int num) {
		boolean flag=true;
		int index=2; 
		while(index<num/2) {
			if(num%index==0) 
				flag=false;
			index++;
		}
		if(flag==true) {
			System.out.println(num);
			count++;
			if(count<=10)
				sum=sum+num;
			if(maxNum<num) {
				maxNum=num;
			}
		}
	}
	
	void primeNumberInRange(int startNum, int lastNum) {
		int index=startNum;
		while(index < lastNum) {
			isPrimeNumber(index);
			index++;
		}
		System.out.println("sum of first 10 prime number is "+sum);
	}
	
	void highestPrimeNum(int startNum, int lastNum) {
		int index=startNum;
		 maxNum=startNum;
		while(index < lastNum) {
			isPrimeNumber(index);
			
			index++;
		}
		System.out.println(maxNum);
	}
	
	public static void main(String[] args) {
		PrimeNumberDifficult primeNumberDifficult	= new PrimeNumberDifficult();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number of range:");
		int num1=scanner.nextInt();
		System.out.println("Enter second number of range:");
		int num2=scanner.nextInt();
		System.out.println("Prime numbers are :");
		primeNumberDifficult.primeNumberInRange(num1,num2);
		primeNumberDifficult.highestPrimeNum(num1,num2);
	}
}
