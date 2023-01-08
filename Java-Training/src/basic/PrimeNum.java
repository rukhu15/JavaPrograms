package basic;

public class PrimeNum {
	void checkPrimeNum(int range) {
		int count;
		for(int i=1;i<range;i++) {
			count=0;
			for(int j=1;j<range;j++) {
				if(i%j==0)
					count =count+1;	
			}
				if(count==2)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		PrimeNum primeNum = new PrimeNum();
		primeNum.checkPrimeNum(50);
		}
}
