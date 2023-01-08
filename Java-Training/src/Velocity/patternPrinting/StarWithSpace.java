package Velocity.patternPrinting;

public class StarWithSpace {
	public static void main(String[] args) {
		int lines=20;
		for(int index=1; index<lines; index=index+2) {
			 for(int j=lines-1; j>index; j--) {
				 System.out.print(" ");
			 }
			 
			for(int i=1; i<=index; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
