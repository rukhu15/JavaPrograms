package string;

public class ReverseWordAndString {
	
	void reverseStringAtItsPosition(String str) {
		String [] words=str.split(" ");
		String newRevese="";
		for(int index=0; index<words.length; index++) {
			String word=words[index];
			String reverseNum="";
			for(int i=word.length()-1; i>=0; i--) {
				reverseNum=reverseNum+word.charAt(i);
			}
			newRevese=newRevese+" "+reverseNum;
		}
		System.out.println(newRevese);
	}
	
	public static void main(String[] args) {
		ReverseWordAndString reverseWordAndString = new ReverseWordAndString();
		String str="Sham is my husband i love him";
		reverseWordAndString.reverseStringAtItsPosition(str);
	}
}
