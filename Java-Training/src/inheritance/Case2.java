package inheritance;

public class Case2 {
	
	public static void main(String[] args) {
		B b1 = new B();
		
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		
		b1.display();
		b1.checkData();
		b1.processData();
	}
}
