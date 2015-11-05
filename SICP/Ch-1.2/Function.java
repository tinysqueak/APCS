
public class Function {

	
	public static void main(String[] args) {
		
		System.out.println(recursive(3));
		System.out.println(iterative(3));
		
	}
	
	public static int recursive(int n) {
		
		if(n < 3) {
			
			return n;
			
		}
		
		return recursive(n - 1) + 2 * recursive(n - 2) + 3 * recursive(n - 3);
		
	}
	
	public static int iterative(int n) {
		
		if(n < 3) {
			
			return n;
			
		}
		
		int result = 0;
		
		while(n >= 3) {
			
			result += iterative(n - 1) + 2 * iterative(n - 2) + 3 * iterative(n - 3);
			n--;
			
		}
		
		return result;
		
	}
	
	
}

