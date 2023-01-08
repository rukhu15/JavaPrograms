package inheritance;

public class Case6 {

	public static void main(String[] args) {
		A a1 = new B();
		B b1 = new B();
		b1= (B)a1;
		
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		
		b1.display();
		b1.processData();
		b1.checkData();
	}
}
