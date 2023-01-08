package Velocity.array;

public class DescendingOrderArray {
	
	int findLargestNum(int [] arr) {
		int temp=0;
		int largeIndex=0;
		temp=arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (temp < arr[index]) {
				temp = arr[index];
				largeIndex = index;
			}
		}
		System.out.println(temp);
		arr[largeIndex] = 0;
		return temp;
	}

	void sortArrayInDescendingOrder(int[] array) {
		int[] sortArray = new int[array.length];
		
		for (int index = 0; index < array.length; index++) {
			sortArray[index] = findLargestNum(array);
		}
		// for printing sorted array
		for(int i = 0; i < sortArray.length-1; i++) {
			System.out.print(sortArray[i]+",");
		}
		System.out.println(sortArray[sortArray.length-1]);

	}
	 
	 public static void main(String[] args) {
		 DescendingOrderArray descendingOrderArray = new DescendingOrderArray();
		 int [] input= {20,60,10,50,40,80,30};
		 descendingOrderArray.sortArrayInDescendingOrder(input);
	}
}
