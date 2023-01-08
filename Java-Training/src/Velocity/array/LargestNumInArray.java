package Velocity.array;

public class LargestNumInArray {
	
	void findLargestNum(int [] arr) {
		int temp=arr[0];
		for(int index=0; index<arr.length; index++) {
			if(temp<arr[index]) {
				temp=arr[index];
			}
		}	
		System.out.println(temp + " is the largest number in the array " );
	}
	
	void findSmallestNum(int [] arr) {
		int temp=arr[0];
		for(int index=0; index<arr.length; index++) {
			if(temp>arr[index]) {
				temp=arr[index];
			}
		}	
		System.out.println(temp + " is the smallest number in the array " );
	}
	
	public static void main(String[] args) {
		LargestNumInArray largestNumInArray = new LargestNumInArray();
		int [] input = {2,2,5,3,11,2,15,3,9};
		largestNumInArray.findLargestNum(input);
		largestNumInArray.findSmallestNum(input);
	}
}
