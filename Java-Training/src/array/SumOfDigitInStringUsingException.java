package array;

public class SumOfDigitInStringUsingException {

	static void FindSumOfDigits(String str) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				temp += str.charAt(index) + "";
				} 
			else {
				try {
					int num = Integer.parseInt(temp);
					sum = sum + num;
					temp = "";
				} catch (NumberFormatException ne) {

				}
			}
		}
		if (!temp.isEmpty()) {
			sum += Integer.parseInt(temp);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		FindSumOfDigits("te62chr7ngfd8jyg9");
	}
}
