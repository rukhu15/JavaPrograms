package basic;

public class ReverseRukhi {

	public String reverseString(String name) {
		String rev="";
		for(int index=name.length()-1;index>=0;index--) {
			rev= rev+name.charAt(index);
		}
		return rev;
	}
	
	public void reverseWords() {
		String sentece="Rukhi is my Wife";
		String temp="";
		String revSen="";
		String[] words=sentece.split(" ");
		for(int i=0;i<words.length;i++) {
			temp = reverseString( words[i]);
			revSen+= temp+" ";
		}
		System.out.println(revSen);
		
	}
	public static void main(String[] args) {
		ReverseRukhi r= new ReverseRukhi();
		r.reverseWords();

	}

}
