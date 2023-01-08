package Velocity;

public class GreaterNumber {

	public static void main(String[] args) {
	
		int a=11;
		int b=47;
		int c=33;
		int d=4;
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("a is greater number in four numbers");
				}
				else {
					System.out.println("d is greater in four numbers");
				}
			}
			else {
				if(c>d) {
					System.out.println(" C is greater number in four numbers");
				}
				else {
					System.out.println("d is greater number in four numbers");
				}
			}
		}
		
	else {
			if(b>c) {
				if(b>d) {
					System.out.println("b is grater numbers in four numbers");
				}
				else {
					System.out.println("b is greater number in four numbers");
				}
			}
			else {
				if(c>d){
					System.out.println("c is greater in four numbers");
				}
				else {
					System.out.println("d is greater in four numbers");
				}
			}
		}
		
	}
}