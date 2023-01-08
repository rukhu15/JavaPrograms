package decoderChallenge;

public class StringMatching {
	
	void stringInGivenArray(String[] array) {
		String temp = "";
		String s1= array[1];
		boolean flag=false;
		for(int index=0; index<array.length; index++) {
			temp= array[0];
		for(int i=0; i<temp.length(); i++)
			if(temp.contains(s1)) {
			flag = true;
			}		
		}
		if(flag==true)
		{
			System.out.println("yes");
		}
		else{System.out.println("No");
		}
		}
	
	public static void main(String[] args) {
		String[] array= {"abcde","abc"};
		String[] array2= {"pqrst","pr"};
		StringMatching stringMatching = new StringMatching();
		stringMatching.stringInGivenArray(array);
		stringMatching.stringInGivenArray(array2);
	}
	}