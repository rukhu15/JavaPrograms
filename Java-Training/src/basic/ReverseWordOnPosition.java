package basic;

public class ReverseWordOnPosition {
	public static void main(String[] args) {
		
		String str="sham is my husband";
		String[] array=str.split(" ");
		String rev="";
		
		for(int index=0; index<array.length; index++) {
			String revWord="";
			for(int indexInner=0; indexInner<array[index].length(); indexInner++) {
				revWord=array[index].charAt(indexInner)+revWord;
			}
			rev+=revWord+" ";
		}
		System.out.println(rev);
	}
}
