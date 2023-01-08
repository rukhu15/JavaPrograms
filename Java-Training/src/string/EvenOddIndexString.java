package string;

public class EvenOddIndexString {
	void findEvenAndOddString(String str) {
		String str1="", str2="";
		for(int index=0; index<str.length(); index++) {
			if(index%2==0) {
				str1+=str.charAt(index)+"";
			}else {
				str2+=str.charAt(index)+"";
			}
		}
		str1=str1+" "+str2;
		System.out.println(str1);
	}
	public static void main(String[] args) {
		EvenOddIndexString evenOddIndexString=new EvenOddIndexString();
		evenOddIndexString.findEvenAndOddString("Dcoder");
		evenOddIndexString.findEvenAndOddString("Algorithm");
	}
}
