package inheritance;

public class Case3 {
	
	public static void main(String[] args) {
		A a1 = new B();
		
		System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.z);
		
		a1.display();
		a1.processData();
		//a1.checkData;
	}
	
}
