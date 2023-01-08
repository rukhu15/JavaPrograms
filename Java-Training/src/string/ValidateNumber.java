package string;

public class ValidateNumber {
	
	void checkPhoneNumber(String num) {
		int length=num.length();
		
		switch(length) {
		case 14:
			if(num.startsWith("+91 ")) {
					char temp=num.charAt(4);
					if(temp=='9' || temp=='8' || temp=='7') {
						System.out.println("Number is valid");
					}
					else {
						System.out.println("Number is invalid");						
					}
				}
			else {
				System.out.println("Number is invalid");
				}
			break;
			
		case 11:
			if(num.startsWith("0")) {
					char temp=num.charAt(1);
					if(temp=='9' || temp=='8' || temp=='7') {
						System.out.println("Number is valid");
					}
					else {
						System.out.println("Number is invalid");
					}
				}
			else {
				System.out.println("Number is invalid");
			}
			break;
			
		case 13:
			char temp=num.charAt(0);
				if(temp=='9' || temp=='8' || temp=='7') {
					if(num.charAt(3)==' ' && num.charAt(7)==' '&& num.charAt(10)==' ') {
						System.out.println("Number is valid");
					}
					else {
						System.out.println("Number is invalid");
					}
				}
				else {
					System.out.println("Number is invalid");
					
				}
				break;
				
		case 10:
			if(num.startsWith("8") || num.startsWith("9") || num.startsWith("7")) {
					System.out.println("Number is valid");
				}
			else {
					System.out.println("Number is invalid");
				}
			break;
		
		default :
			System.out.println("Number is invalid");
		}
	}
	public static void main(String[] args) {
		ValidateNumber validateNumber = new ValidateNumber();
		validateNumber.checkPhoneNumber("9860827");//1
		validateNumber.checkPhoneNumber("+91 9860827498");//1
		validateNumber.checkPhoneNumber("986 082 74 98");//3
		validateNumber.checkPhoneNumber("9860827498");//4
		validateNumber.checkPhoneNumber("8860827498");//5
		validateNumber.checkPhoneNumber("+919860827498");//6
		validateNumber.checkPhoneNumber("098 608 274 98");//7
		validateNumber.checkPhoneNumber("+91  9860827498");//9
		validateNumber.checkPhoneNumber("986 082 7498");//8
		validateNumber.checkPhoneNumber("09860827498");//2
		validateNumber.checkPhoneNumber("+91 1860827498");//10
		validateNumber.checkPhoneNumber("+91 8669836086");//11
	}

}
