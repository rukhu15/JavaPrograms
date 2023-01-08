package basic;

public class AddNumInString {
	public static void main(String[] args) {
		String str="abc25hhgg7hgb2hgjhj9uhjbh1jhgh1b";
		int sum=0;
		int num=0; 
		String str2="";
		String b="";
		for(int index=0; index<str.length(); index++) {
			char a=str.charAt(index);
			if(Character.isDigit(a)) {
				 b+=a;
				 sum=sum+num;
			}else {
				if(!b.isBlank()) {
					num=Integer.parseInt(b);
					System.out.println(num);
				}
				b="";
				str2+=a; 
				
			}
		}
		sum=sum+num;
		System.out.println(sum);
		System.out.println(str2);
	}
}
