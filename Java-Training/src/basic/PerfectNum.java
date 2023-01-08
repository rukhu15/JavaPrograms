package basic;

import java.util.Scanner;

class PerfectNum{
	
	void checkPerfectNum(int num){
		int newNum=0;
		for(int index=1; index<num; index++){
			if(num%index==0){
				newNum=newNum+index;
			}
		}
		if(num==newNum){
			System.out.println(num+" is Perfect Number");
		}
		else{
			System.out.println(num+" is not Perfect Number");
		}
	}
	public static void main(String [] args){ 
	
		PerfectNum perfectNum = new PerfectNum();
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		perfectNum.checkPerfectNum(input);
		
	}
}