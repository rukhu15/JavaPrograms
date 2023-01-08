package string;

public class nummmm {
	 static void checkOrder(String str){
		 String [] strarr=str.split(" ");
	        int [] num=new int[strarr.length];
	        
	        for(int i=0; i<strarr.length; i++){
	        num[i]=Integer.parseInt(strarr[i]);
	        }
	        int count1=0;
	        int count2=0;
	        for(int index=0; index<num.length; index++){
	            
	            if(index<=1){
	               if( num[index]>num[index+1]){
	                   count1++;
	               }
	            }
	            if(index>2 && index<=4){
	                if(num[index+1]>num[index]){
	                count2++;    
	                }
	            }
	        }
	        if(count1==2 && count2==2){
	           System.out.println("Yes"); 
	        }
	    }      
	  public static void main(String args[])
	  {  
	   checkOrder("3 2 -2 -2 -1 3"); 
	  }
	}

