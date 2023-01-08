package array;

import java.util.HashMap;
import java.util.Map;

public class StringOperations {
	
	static void returnVovelString(String [] arr) {
		String  stringWithmaxvolCount= "";
		int max=0;
		for(int i=0; i<arr.length;i++) {
		
			int count=0;
			String temp=arr[i];
			for(int index=0; index<temp.length(); index++) {
				char ch = temp.charAt(index);
				if(ch=='a'|| ch=='i'|| ch=='e'|| ch=='o'|| ch=='u' || ch=='A'|| ch=='I'|| ch=='E'|| ch=='O'|| ch=='U') {
					count++;
				}
			}
			if(max<count) {
				max=count;
				stringWithmaxvolCount=temp;
			}
			System.out.println(arr[i]+" vovel count is "+ count);
		}
		System.out.println(max);
		System.out.println(stringWithmaxvolCount);
	}
	public static void main(String[] args) {
		String[] arr= {"rukaaaaahmini", "Sham", "Manisha", "Abhimanyu"};
		returnVovelString(arr);
	}
}
