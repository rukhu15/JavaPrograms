package array;

public class SecondGreaterNum {
	
	void findBiggerNum(int[] arr) {
		int maxNum=0;
		int secondMax=0;
		int thirdMax=0;
		for(int index=0; index<arr.length; index++) {
			if(maxNum<arr[index]) {
				thirdMax=secondMax;
				secondMax=maxNum;
				maxNum=arr[index];
				
			}
			else if (arr[index]>secondMax) {
				thirdMax=secondMax;
				secondMax=arr[index];
				
			}
			else if(arr[index]>thirdMax) {
				thirdMax=arr[index];
			}
		}
		System.out.println("second bigger num is   "+ secondMax);
		System.out.println("third bigger num is   "+thirdMax);
	}

	public static void main(String[] args) {
		int [] arr = {1,11,3,99,66,22,44};
		SecondGreaterNum secondGreaterNum = new SecondGreaterNum();
		secondGreaterNum.findBiggerNum(arr);
		
	}
}