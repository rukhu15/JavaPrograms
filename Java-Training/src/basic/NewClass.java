package basic;

public class NewClass {

	String str = "pune";
	int a =10;
	 NewClass(){
		System.out.println("hi");
	}
	
	protected NewClass (int num){
		System.out.println("hello");
		a=200;
	}
	
	public static void main(String[] args) {
		NewClass r = new NewClass(21);
	
	}
}
