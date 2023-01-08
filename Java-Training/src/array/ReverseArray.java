package array;

public class ReverseArray {
	void reverseArray(int [] array) {
		int length=array.length-1;
		int [] reverseArray = new int [array.length];
		for(int index=0; index<=length; index++) {
			reverseArray[index]=array[length-index];
			System.out.print(reverseArray[index]+",");
		}
	}
	
	public static void main(String[] args) {
		//ReverseArray reverseArray = new ReverseArray();
		//int[] array= {10,20,70,40,50,66,100};
		//reverseArray.reverseArray(array);
		System.out.println();
		System.out.println(100+100+"addition");
		System.out.println("addition"+100*100);
	}
}
