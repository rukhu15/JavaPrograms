package array;

public class MethodOverloading {
	
	void test() {
		System.out.println("hii");
	}
	
	void test(int a) {
		System.out.println("Hello");
	}
	
	 void test(int a, int b) {
		System.out.println("bye");
	}
	
	 void test(char a, int b) {
		System.out.println("good morning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading a = new MethodOverloading();
		a.test(6,3);

	}

}
