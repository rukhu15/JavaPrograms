package string;

public class rrrrrrrrrrrr {
	public static void main(String[] args) {
		String str="rukhmini abhimanyu khoje";
		String[] arr=str.split(" ");
		String rev="";
		for(int index=0; index<arr.length; index++) {
			String word="";
			for(int i=0; i<arr[index].length(); i++) {
				word=arr[index].charAt(i)+word;
			}
			rev=rev+word+" ";
		}
		System.out.println(rev);
	}
}
