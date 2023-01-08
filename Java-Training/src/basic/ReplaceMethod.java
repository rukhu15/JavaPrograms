package basic;

public class ReplaceMethod {
	public static void main(String[] args) {
		String str="hhhh aaaabbbbdddd hh kkkk";
		str=str.replace(' ', '|');
		String n=str.substring(13);
		String s=str.substring(0,13);
		n="|"+n;
		str=s+n;
		System.out.println(str);
	}
}
