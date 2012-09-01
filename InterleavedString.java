package InterleavedString;


public class InterleavedString {
	//Check if a given string is interleaved with another strings
	public static void main(String [] args){
		
		String a = "abcd";
		String b = "xyz";
		String c = "axybczd";
		
		
		for(char letter : a.toCharArray()){
			if(c.contains(letter +"")){
				c = c.replaceFirst(letter + "","");
				a = a.replaceFirst(letter + "", "");
			}
				
		}
		
		if(a.isEmpty() && c.equals(b)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
	
			
	}
}
