
public class SmallestNum {
	
	
	 void findSmallestNum(int num1, int num2) {
		 int temp=0;
		 for(int index=1; index<10; index++) {
			 temp=num1*index;
			 if(temp%num2==0) {
				 System.out.println("Smallest Number="+ index);
				 break;
			 }
		 }
	 }
	  public static void main(String[] args) {
		SmallestNum smallestNum= new SmallestNum();
		smallestNum.findSmallestNum(4,7);
		smallestNum.findSmallestNum(18,6);
	}
}
