package array;

import java.util.ArrayList;

public class ShiftAllZero {

	static void findZeroInArray(int[] array, int len) {
		int[] newArray = new int[len];
		int reverseIndex = 0;
		for (int index = 0; index < len; index++) {
			if (array[index] != 0) {
				newArray[reverseIndex] = array[index];
				reverseIndex++;
			}
		}
		for (int num : newArray) {
			System.out.print(num + ",");
		}

	}

	void shiftingZeroes(int[] array, int len) {

		int count = 0;
		for (int index = 0; index < len; index++) {
			if (array[index] != 0) {
				array[count++] = array[index];
			}

		}

		 while (count < len) { 
			 array[count++] = 0; 
		}
		 
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 4, 5, 7, 5, 0, 6 };
		int len = arr.length;
		 findZeroInArray(arr, len);
		 System.out.println();
		ShiftAllZero shift = new ShiftAllZero();
		shift.shiftingZeroes(arr, len);
		System.out.println("After shifting");
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + ",");
		}
		
		ArrayList<String> arraylists = new ArrayList<String>();
		arraylists.add("hiii");
	}
}
