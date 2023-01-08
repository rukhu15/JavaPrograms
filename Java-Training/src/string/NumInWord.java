package string;

public class NumInWord {
	public static void main(String[] args) {
		int num=567434;
		System.out.println(Integer.divideUnsigned(2, 4));
		
		int digit=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			digit++;
		}
		System.out.println(digit);
		if(digit==6) {
			
		}
	}
}
