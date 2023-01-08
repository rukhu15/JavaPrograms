package basic;

public class StarPattern {
	
	void print(int num) {
		
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=i; j++) {
			System.out.print(" *");
			}
			System.out.println("");
		}
	}
	
	public static void main (String[] arr) {
		StarPattern starPattern = new StarPattern();
		starPattern.print(5);
	}
}
