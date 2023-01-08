package string;

public class Pangrams {
	static void checkPAngram(String input) {
			 if(input.matches(".*[^a-z].*")) {
				 System.out.println("yes");
			 }else {
				 System.out.println("No");
			 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPAngram("QwertyuiopaSdfgHjklzxcvvbnM");
	}

}
