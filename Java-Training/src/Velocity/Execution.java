package Velocity;

public class Execution {
	static void SumOFIntInString(String name) {
		String digits="";
		int sum=0;
		int num=0;
		for(int index=0; index<name.length(); index++) {
			char temp=name.charAt(index);
			if(Character.isDigit(temp)) {
				digits+=temp+"";
			}
			else {
				num=Integer.parseInt(digits);
				sum+=num;
				digits="";
			}
		}
		if(!digits.isEmpty()) {
			num=Integer.parseInt(digits);
			sum+=num;	
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		SumOFIntInString("ruk3hmi1n4ikho6je1");
	}	
}
