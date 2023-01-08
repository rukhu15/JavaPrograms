package string;

public class ChangeCase {
	String temp;
	void changeCaseAtIndex(String input, int index1, int index2) {
		String newInput=input.replace('D', 'd');
				temp=newInput.substring(index1, index2);
				newInput=newInput.substring(index2, input.length());
				temp=temp.toUpperCase();
				newInput=temp+newInput;
				System.out.println(newInput);
	}
	public static void main(String[] args) {
		ChangeCase changeCase = new ChangeCase();
		changeCase.changeCaseAtIndex("decoDer",0,1); //shAm
	}

}
