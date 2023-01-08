package string;

import java.util.Scanner;

public class FindingNemo {
	
	static void findNemoWOrd(String input, String find) {
		String [] array= input.split(" ");
		for(int index=0; index<array.length; index++) {
			if(find.equals(array[index])) {
				System.out.println(index);
			}
		}
	}
	 
	public static void main(String[] args) {
		findNemoWOrd("this is a nemo in sample input", "nemo");
		Scanner sc= new Scanner(System.in);
		String  input=sc.next();
		System.out.println(input);
		sc.close();
		}
}
