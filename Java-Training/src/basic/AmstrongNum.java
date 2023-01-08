package basic;

public class AmstrongNum {
	public static void main(String[] args) {
		int num=370;
		int numOriginal=370;
		int digit=0;
		int rem=0;
		double sum=0;
		while(num>0) {
			rem=num%10;	
			num=num/10;
			digit++;
		}
		System.out.println(digit);
		if(digit==3 || digit==4) {
		for(int index=0; index<digit; index++) {
			rem=numOriginal%10;	
			numOriginal=numOriginal/10;
			sum=sum+Math.pow(rem, digit);
			}
		System.out.println(sum);
		}
		
	}
}
