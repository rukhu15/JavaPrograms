package string;

public class Asignment_10 { 
	static int sum=0;
	void findCharacterAndDigit(String name) {
		int upperCount=0;
		int lowerCount=0;
		int digitCount=0;
	
		
		for(int index=0; index<name.length(); index++) {
			char ch = name.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
					upperCount++;
				}
				else
					lowerCount++;
			}
			else if(Character.isDigit(ch)) {
			int	num=Character.getNumericValue(ch);
				digitCount++;
				sum=sum+num;//gmhinge@gmail.com
			}
		}
		
		System.out.println("Total letters are: "+ (upperCount+lowerCount));
		System.out.println("Total Upper Class characters are: "+ upperCount);
		System.out.println("Total Lower Class characters are: "+ lowerCount);
		System.out.println("Total digits are: "+ digitCount);
		System.out.println("Sum of digits is: "+ sum);
	}
	
	void charFreq(String str) {
		String s="";
		for(int index=0; index<str.length()-1; index++) {
			char temp=str.charAt(index);
			s=s+temp;
			int count=0;
			//if()
			System.out.println(count);
		}
		
	}
	public static void main(String[] args) {
		Asignment_10 asignment_10 = new Asignment_10();
		//asignment_10.findCharacterAndDigit("Tec9hTNOC2reTdi8ts7");
		asignment_10.charFreq("Tec9NhTNOC2rTedi8Tt2s7");
	}
}

