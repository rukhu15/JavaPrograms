package Velocity;

public class FindPrimeNumber {
	//find total prime numbers between 2 to 100
	void checkPrimeNumber(int num) {
		int count=0;
		for(int index=1; index<=num; index++) {
			if(num%index==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
		int num=100;
		System.out.println("Prime number in a Range");
		for(int index=2; index<num; index++) {
			findPrimeNumber.checkPrimeNumber(index);
		}
	}
}
