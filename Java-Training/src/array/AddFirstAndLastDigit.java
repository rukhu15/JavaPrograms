package array;

public class AddFirstAndLastDigit {
	
	void firstAndLastDigit(int num1) {
		int index=0;
		int lastDigit=num1%10;
		int addition=0;
		int firstDigit=0;
		while(num1>0) {
			firstDigit=num1%10;
			num1=num1/10;
			//index++;
		}
		addition=lastDigit+firstDigit;
		System.out.println(addition);
	}

	public static void main(String[] args) {
		AddFirstAndLastDigit addFirstAndLastDigit = new AddFirstAndLastDigit();
		addFirstAndLastDigit.firstAndLastDigit(1234);
	}

}
