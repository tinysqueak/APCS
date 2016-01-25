
public class CommonPrefix {
	
	public static void main(String[] args) {
			
		System.out.println(common("asdf", "asdfghjkl"));
		
	}
	
	public static String common(String string1, String string2) {
		
		String commonPrefix = "";
		int shorterLength = (string1.length() < string2.length()) ? string1.length() : string2.length();
		
		/*String shorterString = (string1.length() < string2.length()) ? string1 : string2;
		String longerString = (string1.length() < string2.length()) ? string2 : string1;*/
		
		int i = 0;
		while(string1.charAt(i) == string2.charAt(i) && i < shorterLength) {
			
			commonPrefix += string1.charAt(i);
			i++;
			
		}
		
		return commonPrefix;
		
	}
	
	
}