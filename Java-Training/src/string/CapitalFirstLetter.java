package string;

public class CapitalFirstLetter {
	String word ="rukhmini automation center";
	String [] words= word.split(" ");
    String makeFirstLetterCap(String input) {
    	 String temp=input;
    	 char newStrint=' ';
    	 String str="";
    	 String str2="";
    	 for(int index=0; index<temp.length(); index++) {
    		 newStrint=Character.toUpperCase(temp.charAt(0));
    		 if(index!=0) {
    		 str+=temp.charAt(index)+"";
    		 }
    		 str2=temp.charAt(index)+str2+"";
    	}
    	str=newStrint+str;
    	System.out.println(str2);
    	return str;
    }
    void MakeAllCapArray() {
    	String input="";
    	String concate="";
    	for(int index=0; index<words.length; index++) {
    		input=words[index];
    		concate+=makeFirstLetterCap(input);
    	}
    	System.out.println(concate);
    }
	public static void main(String[] args) {
		CapitalFirstLetter capitalFirstLetter = new CapitalFirstLetter();
		capitalFirstLetter.MakeAllCapArray();
	}
}