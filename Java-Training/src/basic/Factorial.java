package basic;

public class Factorial {
	public static void main(String[] args) {
		int num=4;//1
		int multi=1;
		for(int index=1; index<=num; index++) {
			multi=multi*index;
		}
		System.out.println(multi);
	}
}
