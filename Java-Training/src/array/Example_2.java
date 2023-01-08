package array;

public class Example_2 {
	int maxNumber(){
		int[] number = {-11, 13, -17, 19};
		int maxNum=number[0];
		for(int index=0; index<number.length; index++){
			if(maxNum<number[index]) {
				maxNum=number[index];
			}
		}
		return maxNum;
	}
	static int sum(){
		int[] number = {-11, 13, -17, 19};
		int sum=0;
		for(int index=0; index<number.length;index++)
			if(number[index]>0) {
				sum=sum+number[index];
			}
		return sum;
	}
		
		static int sumNegative(){
			int[] number = {-11, 13, -17, 19};
			int sum=0;
			for(int index=0; index<number.length;index++)
				if(number[index]<0) {
					sum=sum+number[index];
				}
			return sum;
	}
	
	int minNumber() {
		int[] number = {-11, 13, -17, 19};
		int minNum=number[0];
		for(int index=0; index<number.length; index++){
			if(minNum>number[index]) {
				minNum=number[index];
			}
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		Example_2 example_2 = new Example_2();
		System.out.println(example_2.maxNumber());
		System.out.println(example_2.minNumber());
		System.out.println(example_2.sum());
		System.out.println(example_2.sumNegative());
		System.out.println((sumNegative()+sum()));
	}

}
