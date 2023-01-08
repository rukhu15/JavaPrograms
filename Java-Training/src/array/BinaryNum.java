package array;

public class BinaryNum {    
		public static void toBinary(int decimal) throws InterruptedException{    
		     int binary[] = new int[40]; 
		     int reverseBinary[]= new int[40];
		     int [] newArray=new int[40];
		     int index = 0; 
		     int reverseDecimal=0;
		     while(decimal > 0){    
		       binary[index] = decimal%2;    
		       decimal = decimal/2;
		       index++;
		     }    
		     for(int i =index-1 ;i >= 0;i--){  
			      // System.out.print(binary[i]);
			       newArray[i]= binary[i];
		     } 
		     
		     Thread.sleep(2000);
		     for(int d=index-1; d>=0; d--) {
		    	 System.out.println(newArray[d]);
		     }
		     System.out.println(newArray[1]);
		     for(int j=0; j<=index-1; j++) {
		    	 reverseBinary[3] =binary[0];
		    	 
		    }
		     System.out.println(); 
		     for(int k=0; k<=index-1; k++) {
		    	 reverseDecimal+= (binary[k])*Math.pow(2,k);
		     }
		     System.out.println(reverseDecimal);
	}
		
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Decimal of 10 is: ");
		//toBinary(6);
		toBinary(10);
	//	toBinary(2);

	}

}
