package string;

public class RepeatingWordString {

	int findCountOfWord(String [] input, String temp) {
		//System.out.println(temp);
		int wordCount=0;
		for(int index=0; index<input.length; index++) {
			if(temp.equals(input[index])) {
				input[index] = "";
				wordCount++;
			}
		}
		return wordCount;
	}
	
	void covertStringInArray(String input) {
		String [] array= input.split(" ");
		String temp="";
		int greaterNum=0;
		int secoundGreaterNum=0;
		for(int index=0; index<array.length; index++) {
			String s;
			if (array[index] != "") {
				s= array[index];
				greaterNum = findCountOfWord(array, array[index]);
				System.out.println(s+" : "+greaterNum);
			}

		}
		
	}
	public static void main(String[] args) {
		String input="can a you can canner can you";
		RepeatingWordString repeatingWordString = new RepeatingWordString();
		repeatingWordString.covertStringInArray(input);
 
	}

}
