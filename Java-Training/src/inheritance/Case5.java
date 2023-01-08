package inheritance;

public class Case5 {
	
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		a1=b1;
		
		System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.z);
		
		a1.display();
		a1.processData();
		//a1.checkData();
		
	}
}
