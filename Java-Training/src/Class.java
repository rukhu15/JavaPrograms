import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int testCases = s.nextInt(); 
	        int length = s.nextInt();
	        String str1=s.next();
	        String str2=s.next();
	        String name="???abbaaa";
	       
	        for(int i=0; i<length; i++){
	            char ch=str1.charAt(i);
	           char temp= str2.charAt(i);
	           	
	            if(ch != temp ){
	            	System.out.println(name.replaceFirst("\\?", "z"));
	            	System.out.println(str1);
	            }
	        }
	            if(str1.equals(str2)){
	                     
	            }            
	       System.out.println(str1);  

		}
	}

/* 
3
4
???n
aman
*/

