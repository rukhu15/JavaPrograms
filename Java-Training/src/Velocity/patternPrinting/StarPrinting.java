package Velocity.patternPrinting;

public class StarPrinting {
	
	public static void main(String[] args) {
		int line=10;
		System.out.println("star pattern");
		System.out.println();
		for(int index=1; index<=line; index++) {
			
			for(int innerIndex=0; innerIndex<index; innerIndex++) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Reverse star pattern");
		for(int index=line; index>=1; index--) {
			for(int innerIndex=1;innerIndex<=index;innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------");
		System.out.println("right hand half diamond");
		for(int index=1; index<=line; index++) {
			
			for(int innerIndex=0; innerIndex<index; innerIndex++) {
			System.out.print("*");
			}
			System.out.println();
		}
	
		for(int index=line-1; index>=1; index--) {
			for(int innerIndex=1;innerIndex<=index;innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
