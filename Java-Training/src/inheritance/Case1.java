package inheritance;

public class Case1 {
	
	public static void main(String[] args) {
		A a1 = new A();
	
		System.out.println(a1.x);
		System.out.println(a1.y);
	//a1.z;
		
		a1.display();
		a1.processData();
	//  a1.checkData();
		
	}
}
