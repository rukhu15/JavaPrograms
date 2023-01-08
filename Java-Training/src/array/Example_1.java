package array;

import java.util.LinkedHashSet;

public class Example_1 {
	static String getMaxStringLengthInArray() {
		//int maxLength=0;
		
		String [] array= {"hi","techno","hey","Rukhmini","poochuk","shama","techocredits"};
		int maxLength=array[0].length();
		String maxString = array[0];
		for(int index=0; index<array.length; index++) {
			String name = array[index];
			
		  int nameLength=array[index].length();
		  if(maxLength<nameLength) {
			  maxLength=nameLength;	
			  maxString = name;
			 // System.out.println( maxLength);
		  }
		}
		return maxString;
	}
	public static void main(String [] arr) {
		Example_1 example_1 = new Example_1();
		example_1.getMaxStringLengthInArray();
		System.out.println(getMaxStringLengthInArray());
		LinkedHashSet<String> hs = new LinkedHashSet<>();
	}
}