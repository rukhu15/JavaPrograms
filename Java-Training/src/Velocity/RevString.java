package Velocity;

public class RevString {
 public static void main(String[] args) {
	String name="manjusha pagar";
	String [] array=name.split(" ");
	System.out.println(name);
	String revName="";
	String rev="";
	String temp="";
	for(int outerIndex=0; outerIndex<array.length; outerIndex++) {
		temp=array[outerIndex];
	for(int index=temp.length()-1; index>=0; index--) {
		revName+=temp.charAt(index);
		}
	rev+=revName+" ";
	temp="";
	revName="";
	}
	System.out.println(rev);
 	}
}
