package string;

import java.util.Scanner;

public class Programme_1 {
	
		static void findFrequencyAllChar(String name, char ch){
			int length=name.length();
			int index=0;
			int count=0;
			while(index<length) {
				if(ch==name.charAt(index)) {
					count++;
				}
				index++;
			}
			System.out.println(ch+"-->"+count);
		}
		
		static void processData(String name) {
			int length= name.length();
			int index=0;
			String s="";
			String r;
			while(index<length) {
				char temp=name.charAt(index);
				r=temp+"";
				s=s+temp;
				if(!s.contains(r)) {
					findFrequencyAllChar(name,temp );
				}
				
				index++;
				r="";
			}
		}
		public static void main(String[] args) {
			//findFrequencyAllChar("Rukhmini",'e');
			
//				Scanner scanner = new Scanner(System.in);
//				System.out.println("enter required string");
//				String name = scanner.next();
			processData("aacbhsbavsvbavbvsbava");
		}
}
