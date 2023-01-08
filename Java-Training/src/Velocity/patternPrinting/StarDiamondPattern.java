package Velocity.patternPrinting;

public class StarDiamondPattern {
	public static void main(String[] args) {
		int line=10;
		for(int index=1; index<=line; index++) {
			for(int spaceIndex=line-1; spaceIndex>=index; spaceIndex--) {
				System.out.print(" ");
			}
			for(int innerIndex=1; innerIndex<=index; innerIndex++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int reverseIndex=line-1; reverseIndex>=1; reverseIndex--) {
			for(int reverseSpaceIndex=line-1; reverseSpaceIndex>=reverseIndex; reverseSpaceIndex-- ) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=reverseIndex; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
