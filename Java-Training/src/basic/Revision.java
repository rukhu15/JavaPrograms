package basic;

public class Revision {
	
	int findLargestNum(int [] arr) {
		int largestNum=arr[0];//20<60
		int largeIndex=0;
		for(int index=0; index<arr.length; index++) {
			if(largestNum<arr[index]) {
				largestNum=arr[index];
				largeIndex=index;
			}
		}
		arr[largeIndex]=0;
		return largestNum;
	}
	
	void sortingArray() {
		int[] arr= {20,60,10,50,40,80,30};
		int[] sortedArray= new int[arr.length];
		for(int index=0; index<arr.length; index++) {
			sortedArray[index]=	findLargestNum(arr);
		}
		for(int num =0; num<sortedArray.length-1; num++) {
			System.out.print(sortedArray[num]+",");
		}
		System.out.print(sortedArray[sortedArray.length-1]);
	}
	
	public static void main(String[] args) {
		Revision revision =new Revision();
		revision.sortingArray();
		
	}
}
