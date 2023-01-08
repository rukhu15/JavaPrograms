package Velocity.array;

public class DuplicateNumInArray {
	
	static void checkDuplicateNum(int [] array) {
		int length=array.length;
		int occurance=0;
		System.out.println("Duplicate numbers and there occurance in array are ==>");
		for(int index=0; index<length; index++) {
			int temp = array[index];
			if(temp != 0) {
				for(int innerIndex=index; innerIndex<length; innerIndex++) {
					if(temp == array[innerIndex]) {
							array[innerIndex]=0;
					occurance++;
					}
				}
			}
			if(occurance>1) {
				System.out.println(temp + "==>" +occurance);
				
			}
			occurance=0;
		}
	}
	
	public static void main(String[] args) {
		int[] inputArray= {11,43,22,76,11,43,65,11,11,100,76};
		checkDuplicateNum(inputArray);
	}
}
