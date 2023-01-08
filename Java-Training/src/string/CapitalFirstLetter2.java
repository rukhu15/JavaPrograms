package string;

import java.util.HashSet;

public class CapitalFirstLetter2 {

	
	//Syso
	void method() {
		String sen ="sham rao babu rao ugale";
		String[] words= sen.split(" ");
		for(int index=0; index<words.length; index++) {
		String firstCapital= words[index].substring(0, 1).toUpperCase();
		String restletters= words[index].substring(1);
	//	System.out.println(firstCapital);
		System.out.print(firstCapital+restletters);
		}
		String str = new String();
		int l=words.length;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapitalFirstLetter2 c= new CapitalFirstLetter2();
		c.method();
		HashSet<String> hs =new  HashSet<>();
		hs.add(null);
	}

}
