package finalPractice;

public class ReverseString {
	
	public static void reverseString(){
		String name="Rukhmini", nameRev="";
		
		for(int index=name.length()-1; index>=0; index--) {
			nameRev=nameRev+name.charAt(index);
		}
		System.out.println(nameRev);
	}
	
	public static int[] addNumPresentInString() {
		String str="12ruk123mng6rj7nk9mks35mn6", charSeq="";
		char temp;
		int sum=0;
		int num=0;
		int count=0;
		int [] array = new int[10];
		for(int index=0; index<str.length(); index++) {
			temp=str.charAt(index);
			if(Character.isDigit(temp)) {
				charSeq=charSeq+temp+"";
				num=Integer.parseInt(charSeq);
			}else{
				if(num!=0) {
					array[count]=num;
					count++;
				}
				sum=sum+num;
				charSeq="";
				num=0;
			}
		}
		System.out.println(array[1]);
		System.out.println(sum);
		return array;
	}
	
	public static int firstHighestNumInArray(int [] arr) {
		int highNum=arr[0];
		int highNumIndex=0;
		for(int index=0; index<arr.length; index++) {
			int num=arr[index];
			if(highNum<num) {
				highNum=num;
				highNumIndex=index;
			}
		}
		arr[highNumIndex]=0;
		System.out.println(highNum);
//		System.out.println(highNumIndex);
		return highNumIndex;
	}
	
	public static void secondHighestNumInArray(int [] arr) {
		int highNumIndex=0;
		for(int index=0; index<arr.length; index++) {
			highNumIndex=firstHighestNumInArray(arr);
			arr[highNumIndex]=0;
			}
		}
	
	
	public static void main(String[] args) {
		reverseString();
		int[] arr=addNumPresentInString();
		//firstHighestNumInArray(arr);
		secondHighestNumInArray(arr);
	}
}
