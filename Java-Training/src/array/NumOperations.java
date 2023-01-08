package array;

public class NumOperations {
	
	static int findMaxInArray(int [] arr) {
		int max=arr[0];
		int maxIndex=0;
		for(int index=0; index<arr.length; index++) {
			if(max<arr[index]) {
				max=arr[index];
				maxIndex=index;
			}
		}
		System.out.println("maximum num in array " +max);
		return maxIndex;
	}
	
	static void findMinNumInArray(int [] arr){
		int min=arr[0];
		for(int index=0; index<arr.length; index++) {
			if(min>arr[index]) {
				min=arr[index];
			}
		}
		System.out.println("minimum num in array " +min);
	}
	static void sumOfNumInArray(int [] arr) {
		int sum=0;
		for(int index=0; index<arr.length; index++) {
			sum=sum+arr[index];
		}
		int avg=0;
		avg=sum/arr.length;
		System.out.println("Sum of number in array "+sum);
		System.out.println("avg is "+avg);
	}
	
	static void sortingOfArray(int [] arr) {
		int [] sortedArr=new int[arr.length];
		for(int i =0; i<arr.length; i++) {
			int max=arr[0];
			int maxIndex1=0;
			for(int index=0; index<arr.length; index++) {
				if(max<arr[index]) {
					max=arr[index];
					maxIndex1=index;
				}
			}
			System.out.println("maximum num in array " +max);
			sortedArr[i]=max;
			arr[maxIndex1]=0;
			//System.out.println("maximum num in array " +max);
		}
		
		for(int j=0; j<sortedArr.length; j++) {
			System.out.print(sortedArr[j] +" , ");
		}
	}
	
	public static void main(String[] args) {
		int [] arr= {2,48,120,68,983,87};
//		findMaxInArray(arr);
//		findMinNumInArray(arr);
//		sumOfNumInArray(arr);
		sortingOfArray(arr);
	}
}
