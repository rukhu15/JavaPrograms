package basic;

public class RevNum {
	static void display() {
		int num = 123456;
		int rev =0;
		int mod=0;
		while(num>0){
			mod=num%10;//123%10=3
			rev=rev*10+mod;
			num=num/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		System.out.println("reverse num");
		display();
	}
}

