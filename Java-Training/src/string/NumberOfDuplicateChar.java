package string;

import java.util.Scanner;

public class NumberOfDuplicateChar {
	void checkDuplicateOrUniqChar(String input){
		int countUniq=0;
		int cntDuplicate=0;
		char ch;
		int length=input.length();
		for(int index=0; index<length; index++) {
			ch=input.charAt(index);
			if (input.indexOf(ch)== input.lastIndexOf(ch)) {
				countUniq++;
			}
			else
				cntDuplicate++;
		}
		if(cntDuplicate > countUniq) {
			System.out.println("java");
		}
		else
			System.out.println("selenium");
	}
	public static void main(String[] args) {
		NumberOfDuplicateChar numberOfDuplicateChar = new NumberOfDuplicateChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input String");
		String input = scanner.next();
		numberOfDuplicateChar.checkDuplicateOrUniqChar(input);
	}
}
