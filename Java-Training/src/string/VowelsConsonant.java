package string;

public class VowelsConsonant {
	public static void main(String[] args) {
		String str="pig";
		char ch=str.charAt(0);String str1="";
		if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
			
		}else {
			for(int index=1; index<str.length(); index++) {
				
				str1+=str.charAt(index)+"";
			}
		}
		str1=str1+ch+"ay";
		System.out.println(str1);
	}
}
