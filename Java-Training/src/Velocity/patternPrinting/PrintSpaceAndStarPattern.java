package Velocity.patternPrinting;

public class PrintSpaceAndStarPattern {
	public static void main(String[] args) {
		int line=10;
		System.out.println("space and star pattern");
		for(int index=1;index<=line; index++) {
			
			for(int spaceIndex=line-1; spaceIndex>=index; spaceIndex--) {
				System.out.print(" ");
			}
			for(int innerIndex=1; innerIndex<=index; innerIndex++) {
				System.out.print("*");	
			}
			System.out.print("       ");
			for(int innerIndex2=1; innerIndex2<=index; innerIndex2++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Reverse space and star pattern");
	for(int index=line;index>=1; index--) {
			
			for(int spaceIndex=line-1; spaceIndex>=index; spaceIndex--) {
				System.out.print(" ");
			}
			for(int innerIndex=1; innerIndex<=index; innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println("-----------------------------------------------------");
	System.out.println("left hand half diamond");
	for(int index=1;index<=line; index++) {
		
		for(int spaceIndex=line-1; spaceIndex>=index; spaceIndex--) {
			System.out.print(" ");
		}
		for(int innerIndex=1; innerIndex<=index; innerIndex++) {
			System.out.print("*");
		}
		System.out.println();
	}

	for(int index=line-1;index>=1; index--) {
		
		for(int spaceIndex=line-1; spaceIndex>=index; spaceIndex--) {
			System.out.print(" ");
		}
		for(int innerIndex=1; innerIndex<=index; innerIndex++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}