package revison;

public class String1 {
	

	void printAllCharInInput(String input, char ch) {
		int count = 0;
		String temp="";
		for (int index = 0; index < input.length(); index++) {
			//System.out.println(input.charAt(index));
			temp=temp+input.charAt(index);
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println(ch + " ==> " + count);
	}

	void printAllCharInReverseOrder(String input) {
		for (int index2 = input.length() - 1; index2 >= 0; index2--) {
			System.out.println(input.charAt(index2));
		}
	}

	void findOccuranceOfChar(String input) {
		char ch= ' ';
		for (int index3 = 0; index3 < input.length(); index3++) {
			ch = input.charAt(index3);
			if(index3 == input.indexOf(ch)) {
			printAllCharInInput(input, input.charAt(index3));
			}
		}

	}

	public static void main(String[] args) {
		String1 string1 = new String1();
		// string1.printAllCharInInput("tecnho", 'a');
		// string1.printAllCharInReverseOrder("techno");
		string1.findOccuranceOfChar("akansha");
	}
}
