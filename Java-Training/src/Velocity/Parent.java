package Velocity;

public class Parent {
	
	public Parent(){
		System.out.println("public constructor");
	}
	
	Parent(int a){
		System.out.println("default constructor");
	}
	
	private Parent(int a, int b){
		System.out.println("private constructor");
	}
	
	protected Parent(String s) {
		System.out.println("protected constructor");
	}
	
	public static void m1() {
		System.out.println("m1");
	}
		
	static void m2() {
		 System.out.println("m2");
	 }
		 
	private static void m3() {
		System.out.println("m3");
	 }
	
	 protected  void m4() {
		System.out.println("m4");
	}
}