package basic;

public class SumOfNum {
	public static void main(String[] args) {
		String str="abc25hhgg7hgb2hgjhj9uhjbh1jhgh1b";
		int num,sum=0;
		String doubleDigit="";
		for(int index=0; index<=str.length()-1;index++) {
			
			char ch= str.charAt(index);
			if(Character.isDigit(ch)) {
				doubleDigit=doubleDigit +ch; 
			}else {
				if(!doubleDigit.isBlank()) {
					num= Integer.parseInt(doubleDigit);
					sum=sum+num;
				}
				doubleDigit="";
			}
		}
		System.out.println(sum);
	}
}
