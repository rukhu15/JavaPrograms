package array;

public class ArraySum {
	
	void arraySum(int[] array) {
		int sum=0;
		int max=array[0];
		String str="Rukhmini";
		
		for(int index=0; index<array.length; index++) {
			sum+=array[index];
			if(max<array[index]) {
				max=array[index];
			}
		}
		System.out.println(sum);
		System.out.println(sum%max);
	}
	
	public void missingNum(int [] array) {
		int n=array.length+1;
		int exSum=(n*(n+1)/2);
		
		for(int index=0; index<array.length; index++) {
			exSum=exSum-array[index];
		}
		System.out.println(exSum);
	}

	public static void main(String[] args) {
		int [] array= {1,3,4,5,6};
		ArraySum arraySum = new ArraySum();
		arraySum.arraySum(array);
		String str="rukhmini";
		String a=str.valueOf(10.24);
		System.out.println(a);
		arraySum.missingNum(array);
	}

}
