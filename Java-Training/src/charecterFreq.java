import java.util.HashMap;

public class charecterFreq {
	public static void main(String[] args) {
		String input="AASSRYUOPPAA";
	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
	
		for(int index=0; index<input.length(); index++) {
		char ch=input.charAt(index);
		
		if(map.containsKey(ch)) {
			int cnt=map.get(ch);
			map.put(ch, cnt+1);
		}else{
			map.put(ch, 1);
		}
		}
		System.out.println(map);
	}
}
