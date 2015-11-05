
public class Function {

	
	public static void main(String[] args) {
		
		System.out.println(recursive(4));
		System.out.println(iterative(4, 4));
		
	}
	
	public static int recursive(int n) {
		
		if(n < 3) {
			
			return n;
			
		}
		
		return recursive(n - 1) + 2 * recursive(n - 2) + 3 * recursive(n - 3);
		
	}
	
	public static int iterative(int n, int counter) {
		
		if(counter < 3) {
			
			return n;
			
		}
		
		return iterative((n - 1) + 2 * (n - 2) + 3 * (n - 3), --counter);
		
	}
	
	
	
	
}

