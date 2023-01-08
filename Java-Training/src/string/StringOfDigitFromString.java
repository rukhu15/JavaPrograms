package string;

public class StringOfDigitFromString {
	//Using Exception
	static void addDigitInString(String str) {
		String [] array=str.split(" ");
		int sum=0;
		int num=0;
		
			for(int index=0; index<array.length; index++) {
				try {
				num =Integer.parseInt(array[index]);
				sum=sum+num;
				}catch(NumberFormatException nfe) {
			
				}
			}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		String str="I am 25 year and 7 months old";
		addDigitInString(str) ;
	}

}
