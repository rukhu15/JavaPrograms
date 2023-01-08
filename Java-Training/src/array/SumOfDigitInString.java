package array;

public class SumOfDigitInString {
	
	void findSumOfDigits(String str) {
		int sum=0;
		String temp="";
		String[] arr=str.split(" ");
		for(int index=0; index<arr.length; index++) {
			String checkDigit=arr[index];
			for(int innerIndex=0; innerIndex<checkDigit.length(); innerIndex++) {
				char ch=checkDigit.charAt(innerIndex);
				if(Character.isDigit(ch)) {
					temp=temp+ch+"";
					int num=Integer.parseInt(temp);
					sum=sum+num;
					temp="";
				}
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		String str="i am 25 year and 6 months old";
		SumOfDigitInString sumOfDigitInString = new SumOfDigitInString();
		sumOfDigitInString.findSumOfDigits(str);
	}

}
