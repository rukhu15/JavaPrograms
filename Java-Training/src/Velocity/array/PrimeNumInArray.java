package Velocity.array;

public class PrimeNumInArray {
	
	void isPrimeNum(int[] input) {
		for(int index=0; index<input.length; index++) {
			int count=0;
			int temp=input[index];
			for(int innerIndex=1; innerIndex<=temp; innerIndex++) {
				if(temp%innerIndex==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(temp);
			}
		}
	}
	
	public static void main(String[] args) {
		PrimeNumInArray primeNumInArray = new PrimeNumInArray();
		int[] array = {5,6,8,22,11,17,41};
		System.out.println("Prime numbers in array:");
		primeNumInArray.isPrimeNum(array);
	}
}
