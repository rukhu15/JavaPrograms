package string;

public class CharFrequency {
	
	void displayRepeatNum(String name, char ch) {
		int count = 0;
		 for(int index=0; index<name.length(); index++)
			 if(name.charAt(index)== ch)
			 count++;
		 System.out.println(ch+"------->"+count);
	}
	
	
	void freqOfAllChar(String str){
		for(int i=0; i<str.length();i++) {
			String str1=str.charAt(i)+"";
			displayRepeatNum(str, str.charAt(i));
			str=str.replaceAll(str1, "");
			i--;
		}
	}
	
	public static void main(String[] args) {
		CharFrequency charFrequency = new CharFrequency();
		//charFrequency.displayRepeatNum("Travelling", 'l');
		charFrequency.freqOfAllChar("Trarvelling");
	}
}
