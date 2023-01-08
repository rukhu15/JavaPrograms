package Velocity;

public class AmstrongNum_ForLoop {
	
  void checkArmstrongNum(int num){
		int digit=0;
		int remainder;
		int sum=0;
		int originalNum=num;
		// for finding number of digits in Number
		while(num>0) {
			num=num/10;
			digit++;
		}
		
		num=originalNum;
		
		if(digit==3 || digit==4) {//100
			
			for(int index=1; index<4; index++) {
				remainder=num%10;
				sum=(int) (sum+Math.pow(remainder, digit));
				num=num/10;
			}
			if(num>0) {
				sum+=Math.pow(num, digit);
			}
			if(sum==originalNum) {
				System.out.println(sum);
			}
		}
  	}
  
  void findArmstrongNumInRange(int num1, int num2) {
	  for(int index=num1; index<=num2; index++) {
		  checkArmstrongNum(index);
		}
	}

  public static void main(String[] args) {
	  AmstrongNum_ForLoop amstrongNum_ForLoop = new AmstrongNum_ForLoop();
	  System.out.println("Three and four digit Armstrong Numbers are:");
	  amstrongNum_ForLoop.findArmstrongNumInRange(100, 9999);
	}
}
