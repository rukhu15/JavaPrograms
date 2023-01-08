package Velocity.patternPrinting;

public class PrintOddNumberOfStarPattern {

	public static void main(String[] args) {
		System.out.println("Odd number of stars pattern");
		int line=15;
		for(int index=1; index<=line; index=index+2) {
			for(int spaceIndex=line-1; spaceIndex>=index; spaceIndex--) {
				System.out.print(" ");
			}
			
			for(int innerindex=1  ; innerindex<=index; innerindex++ ){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Reverse of odd number of stars pattern");
		System.out.println();
		for(int index=line; index>=1; index=index-2) {
			for(int spaceIndex=line-1; spaceIndex>=index; spaceIndex--) {
				System.out.print(" ");
			}
			
			for(int innerindex=1  ; innerindex<=index; innerindex++ ){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
