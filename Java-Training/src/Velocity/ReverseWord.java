package Velocity;

public class ReverseWord {
	
	static void reverseStringOnSamePlace(){
		String input = "Myself Rukhmini abhimanyu khoje";
		System.out.println(input);
		String [] arr=input.split(" ");
		String rev="";
		String wordRevers="";
		for(int index=0; index<arr.length; index++) {
			String temp=arr[index];
			for(int innerIndex=temp.length()-1; innerIndex>=0; innerIndex--) {
				char a =temp.charAt(innerIndex);
				wordRevers+=a;
			}
			rev+=wordRevers+" ";	
			temp="";
			wordRevers="";
		}
		System.out.println("Reverse of words on its position");
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		reverseStringOnSamePlace();
	}
}
