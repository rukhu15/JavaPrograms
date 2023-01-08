package Velocity.array;

public class DuplicateStringInArray {
	
	static void findDuplicateString(String [] arr) {
		int occurance=0;
		String temp="";
		System.out.println("Duplicate Strings and its occurances are:");
		for(int index=0; index<arr.length; index++) {
			temp = arr[index];
			if(temp != "") {
				for(int innerIndex=0; innerIndex<arr.length; innerIndex++) {
					if(temp.equals(arr[innerIndex])) {
						arr[innerIndex]="";
						occurance++;
					}
				}
			}
			if(occurance>1) {
				System.out.println(temp + "-->" + occurance);
			}
			occurance=0;
		}
	}
	
	public static void main(String[] args) {
		String [] input = {"Rahul", "yogesh", "rahul", "apurva", "yogesh", "Rahul", "yogesh"};
		findDuplicateString(input);
	}
}
